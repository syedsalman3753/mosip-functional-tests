package io.mosip.kernel.scripts;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.mosip.dbHealthcheck.DBHealthCheck;
import io.mosip.dbaccess.read_otpTransactiondb;

import io.mosip.service.ApplicationLibrary;
import io.mosip.service.AssertPreReg;
import io.mosip.service.BaseTestCase;
import io.mosip.util.CommonLibrary;
import io.mosip.util.ReadFolder;
import io.restassured.response.Response;

/**
 * The Class generating otp.
 *
 * @author Jyoti Kori
 */
public class otpGenerate extends BaseTestCase {
	
	otpGenerate() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Defining Logger variables
	private static Logger logger = Logger.getLogger(otpGenerate.class);
	
	boolean status = false;
	String finalStatus = "";
	public static JSONArray arr = new JSONArray();
	ObjectMapper mapper = new ObjectMapper();
	static Response response = null;
	static JSONObject responseObject = null;
	private static AssertPreReg preRegAssertions = new AssertPreReg();
	private static ApplicationLibrary applicationLibrary = new ApplicationLibrary();
	private static final String otpGenerate_URI = "/otpmanager/v1.0/otp/generate";

	/*
	 * Data Prividers to read the input json files from the folders
	 */
	
	
	@DataProvider(name = "createPreReg")
	public Object[][] readData(ITestContext context) throws JsonParseException, JsonMappingException, IOException, ParseException {
		 String testParam = context.getCurrentXmlTest().getParameter("testType");
		 switch ("smokeAndRegression") {
		case "smoke":
			return ReadFolder.readFolders("kernel\\otpGenerate", "otpGenerateOutput.json","otpGenerateRequest.json","smoke");
			
		case "regression":	
			return ReadFolder.readFolders("kernel\\otpGenerate", "otpGenerateOutput.json","otpGenerateRequest.json","regression");
		default:
			return ReadFolder.readFolders("kernel\\otpGenerate", "otpGenerateOutput.json","otpGenerateRequest.json","smokeAndRegression");
		}
		
	}
	
	
	/*
	 * 
	 * Given input Json as per defined folders When POST request is sent to /otpmanager/v1.0/otp/generate
	 * Then Response is expected as 200 and other responses as per inputs passed in the request
	 */
	@SuppressWarnings("unchecked")
	@Test(dataProvider = "createPreReg")
	public void generate_Response(String fileName, Integer i, JSONObject object)
			throws JsonParseException, JsonMappingException, IOException, ParseException {
		String filepath=System.getProperty("user.dir") + "\\src\\test\\resources\\"+fileName+"\\otpGenerateRequest.json";
		JSONObject requestKeys= (JSONObject) new JSONParser().parse(new FileReader(filepath));
		String keys = "";
		for(Object obj: requestKeys.keySet()) {
			keys += obj.toString()+ ",";
		}
		keys = keys.substring(0, keys.length() - 1);
		if (object.get("testType").toString().equals("smoke"))
			CommonLibrary.configFileWriter(keys, fileName, object.toJSONString(), 1, "positive");
		else
			CommonLibrary.configFileWriter(keys, fileName, object.toJSONString(), 2, "negative");
		/**
		 * Data Utility
		 */
		//new Main().ApiRunner();
		String configPath = System.getProperty("user.dir") + "\\src\\test\\resources\\" + fileName + "\\";
		File folder = new File(configPath);
		File[] listOfFolders = folder.listFiles();
		for (int j = 0; j < listOfFolders.length; j++) {
			if (listOfFolders[j].isDirectory()) {
				if(listOfFolders[j].getName().equals(object.get("testCaseName").toString())) {
					logger.info("name of test Case------------------------>"+listOfFolders[j].getName());
				File[] listofFiles = listOfFolders[j].listFiles();
				for (int k = 0; k < listofFiles.length; k++) {

					if (listofFiles[k].getName().toLowerCase().contains("request")) {
						JSONObject objectData = (JSONObject) new JSONParser()
								.parse(new FileReader(listofFiles[k].getPath()));

						logger.info("Json Request Is : " +objectData.toJSONString());
						response = applicationLibrary.PostRequest(objectData.toJSONString(), otpGenerate_URI);

					} else if (listofFiles[k].getName().toLowerCase().contains("response")) {
						responseObject = (JSONObject) new JSONParser().parse(new FileReader(listofFiles[k].getPath()));

					}

				}
				
			//	status = preRegAssertions.assertPreRegistration(response, responseObject);
				if (status) {
					
					
							int statusCode=response.statusCode();
							logger.info("Status Code is : " +statusCode);
							
							if (statusCode==200)
							{
								String otp=(response.jsonPath().get("otp")).toString();
								logger.info("otp is : " +otp);
								
								boolean otpPresence=read_otpTransactiondb.readotpTransaction(otp);
								if(otpPresence)
									finalStatus ="Pass";
							}
							
						}
					
					
				 else {
					finalStatus ="Fail";
					break;
				}
			}
			} else {
				continue;
			}
		}
		object.put("status", finalStatus);
		arr.add(object);
	}

	@AfterClass
	public void updateOutput() throws IOException {
		String configPath = System.getProperty("user.dir") + "\\src\\test\\resources\\kernel\\otpGenerate\\otpGenerateOutput.json";
		try (FileWriter file = new FileWriter(configPath)) {
			file.write(arr.toString());
			logger.info("Successfully updated Results to Create_PreRegistrationOutput.json file.......................!!");
		}
	}
}
