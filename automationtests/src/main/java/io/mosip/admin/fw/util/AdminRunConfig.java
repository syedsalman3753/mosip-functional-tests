package io.mosip.admin.fw.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.yaml.snakeyaml.Yaml;

import io.mosip.authentication.fw.dto.ErrorsDto;
import io.mosip.authentication.fw.util.RunConfig;
import io.mosip.authentication.fw.util.RunConfigUtil;

public class AdminRunConfig extends RunConfig {
	private Logger logger = Logger.getLogger(AdminRunConfig.class);
	private String testDataPath;
	private String adminEndPointUrl;
	private String adminCreateRegCentrePath;
	private String scenarioPath;
	private String testType;
	private String testDataFolderName;
	private String moduleFolderName;
	private String searchValidDocumentPath;
	private String searchDocCategories;
	private String searchMachinePath;
	public  String deviceSearchPath;
	public  String deviceFilterPath;
	private String deviceSpecSearchPath;
	private String deviceSpecFilterPath;
	private String deviceTypeSearchPath;
	private String deviceTypeFilterPath;
	private String titleSearchPath;
	private String titleFilterPath;
	private String holidaySearchPath;
	private String FilterTempateDetailsPath;
	private String filterDocCategory;
	public String adminCreateRegistrationCentrePath;
	private String searchDocumentTypePath;
	public String adminMachineTypeSearchPath;
	private String searchBlackListedWordsPath;
	public String adminIndividualTypesSearch;
	public String adminUpdateRegistrationCentrePath;
	public String adminRegistrationCentreSearchPath;

	public String adminRegistrationCentreFilterPath;
	public String adminSearchTemplateDetails;
	public String adminGenderSearchPath;
	public String adminGenderFilterPath;

	public String MapDocumentCategoryAndDocumentType;
	private String filterBlackListedWordsPath;
	private String filterDocCatTypMapping;
	private String filterDocumentTypePath;
	private String filterMachinesPath;
	private String searchMachineSpec;
	private String filterMachineSpec;
	private String unmapDocCategoryType;
	private String searchLocationPath;
	private String setZoneHierarchy;
	private String setGetZoneNameBasedOnUserIDAndLangCode;
	private String setGetLeafZones;
	private String filterLocationPath;
	private String createBlackListedWordsPath;
	private String createLocationDataPath;
	private String updateBlackListedWordsPath;
	private String updateLocationData;
	private String decommisionMachinePath;
	private String decommisionDevicePath;
	private String decommisionRegCenterPath;
	private String deviceValidatePath;
	private String filterIndividualTypePath;
	private String filterHolidaysPath;
	private String searchRegCenterTypePath;
	private String filterRegCenterTypePath;
	private String deviceRegisterPath;
	private String deviceValidateHistoryPath;
	private String deviceDeRegisterPath;
	private String registerDevProviderPath;
	private String updateDevProviderPath;
	private String updateDeviceStatusPath;
	private String registerFTPPath;
	private String updateFTPPath;
	private String mapDeviceRegCenterPath;
	private String mapUserRegistrationCenterPath;
	private String unmapUserRegistrationCenterPath;
	private String registerMDSPath;
	private String updateMDSPath;
	private String unmapDeviceRegCenterPath;
    private String mapMachineRegCenterPath;
    private String unmapMachineRegCenterPath;
    private String createMachinePath;
    private String updateMachinePath;
    private String createDevicePath;
    private String createDocumentTypePath;
    private String updateDocumentTypePath;
    private String fetchPacketStatusPath;
    private String updateDevicePath;
    private String fetchHolidayLocationPath;
    private String fetchRegCenterWorkingDays_kernelPath;
    private String fetchRegCenterExceptionalHolidays_kernelPath;
    
    private String updateHolidayPath;
    private String createTitlePath;
    private String updateTitlePath;
    private String createMachineTypePath;
    private String updateMachineTypePath;
    private String createDeviceSpecificationPath;
    private String updateDeviceSpecificationPath;
    private String createMachineSpecificationPath;
    private String updateMachineSpecificationPath;
    private String createRegCenterTypePath;
    private String updateRegCenterTypePath;
    private String createTemplateFileFormatPath;
    private String updateTemplateFileFormatPath;

	private String createHolidayPath;
	private String createGenderPath;
	private String updateGenderPath;
	private String createDocumentCategoryPath;
	private String updateDocumentCategoryPath;
	
	private String createTemplatePath;
    private String updateTemplatePath;
    private String createTemplateTypePath;
    private String createDeviceTypePath;
    private String updateDeviceTypePath;
    private String createIndividualTypePath;
    private String updateIndividualTypePath;

    

	@Override
	public void setConfig(String testDataPath, String testDataFileName, String testType) {
		setAdminEndPointUrl(AdminTestUtil.getPropertyValue("adminEndpointUrl"));
		setAdminCreateRegCentrePath(AdminTestUtil.getPropertyValue("adminCreateRegCentrePath"));
		setAdminCreateRegistrationCentrePath(AdminTestUtil.getPropertyValue("adminCreateRegistrationCentrePath"));
		setAdminUpdateRegistrationCentrePath(AdminTestUtil.getPropertyValue("adminUpdateRegistrationCentrePath"));
		setAdminRegistrationCentreSearchPath(AdminTestUtil.getPropertyValue("adminRegistrationCentreSearchPath"));
		setTestDataPath(testDataPath);
		File testDataFilePath = new File(RunConfigUtil.getResourcePath() + testDataPath + testDataFileName);
		setFilePathFromTestdataFileName(testDataFilePath, testDataPath);
		setTestType(RunConfigUtil.getTestLevel());
		setSearchMachinePath(AdminTestUtil.getPropertyValue("searchMachinePath"));
		setDeviceSearchPath(AdminTestUtil.getPropertyValue("deviceSearchPath"));
		setDeviceFilterPath(AdminTestUtil.getPropertyValue("deviceFilterPath"));
		setSearchValidDocumentPath(AdminTestUtil.getPropertyValue("searchValidDocumentPath"));
		setDeviceSpecSearchPath(AdminTestUtil.getPropertyValue("deviceSpecSearchPath"));
		setDeviceSpecFilterPath(AdminTestUtil.getPropertyValue("deviceSpecFilterPath"));
		setDeviceTypeSearchPath(AdminTestUtil.getPropertyValue("deviceTypeSearchPath"));
		setDeviceTypeFilterPath(AdminTestUtil.getPropertyValue("deviceTypeFilterPath"));
		setTitleSearchPath(AdminTestUtil.getPropertyValue("titleSearchPath"));
		setHolidaySearchPath(AdminTestUtil.getPropertyValue("holidaySearchPath"));		
		setSearchDocumentTypePath(AdminTestUtil.getPropertyValue("searchDocumentTypePath"));
		setAdminMachineTypeSearchPath(AdminTestUtil.getPropertyValue("adminMachineTypeSearch"));
		setFilterDocCategory(AdminTestUtil.getPropertyValue("filterDocCategory"));
		setAdminIndividualTypesSearch(AdminTestUtil.getPropertyValue("adminIndividualTypesSearch"));
		setAdminSearchTemplateDetails(AdminTestUtil.getPropertyValue("adminSearchTemplateDetails"));
		setTitleFilterPath(AdminTestUtil.getPropertyValue("titleFilterPath"));
		setSearchBlackListedWords(AdminTestUtil.getPropertyValue("searchBlacklistedWord"));
		setSearchDocCategories(AdminTestUtil.getPropertyValue("searchDocCategories"));
		setAdminMachineTypeSearchPath(AdminTestUtil.getPropertyValue("adminIndividualTypesSearch"));

		setAdminGenderSearchPath(AdminTestUtil.getPropertyValue("adminGenderSearchPath"));
		setAdminGenderFilterPath(AdminTestUtil.getPropertyValue("adminGenderFilterPath"));
		setAdminRegistrationCentreFilterPath(AdminTestUtil.getPropertyValue("adminRegistrationCentreFilterPath"));

		setFilterTempateDetailsPath(AdminTestUtil.getPropertyValue("filterTemplateDetails"));
		setFilterBlackListedWordsPath(AdminTestUtil.getPropertyValue("filterBlackListedWords"));
		setFilterDocCatTypMapping(AdminTestUtil.getPropertyValue("filterDocCatTypMapping"));
		setFilterDocumentTypePath(AdminTestUtil.getPropertyValue("filterDocumentType"));
		setFilterMachinesPath(AdminTestUtil.getPropertyValue("filterMachinePath"));
		setSearchMachineSpec(AdminTestUtil.getPropertyValue("searchMachineSpec"));
		setFilterMachineSpec(AdminTestUtil.getPropertyValue("filterMachineSpec"));
		setUnmapDocCategoryType(AdminTestUtil.getPropertyValue("unmapDocCategoryType"));
		setSearchLocationDataPath(AdminTestUtil.getPropertyValue("searchLocationDataPath"));
		setSetZoneHierarchy(AdminTestUtil.getPropertyValue("getZoneHierarchy"));
		setSetGetZoneNameBasedOnUserIDAndLangCode(AdminTestUtil.getPropertyValue("getZoneNameBasedOnUserIDAndLangCode"));
		setSetGetLeafZones(AdminTestUtil.getPropertyValue("getLeafZones"));
		setFilterLocationPath(AdminTestUtil.getPropertyValue("filterLocationDataPath"));
		setCreateBlackListedWordsPath(AdminTestUtil.getPropertyValue("createBlackListedWordsPath"));
		setCreateLocationDataPath(AdminTestUtil.getPropertyValue("createLocationDataPath"));
		setUpdateBlackListedWordsPath(AdminTestUtil.getPropertyValue("updateBlackListedWordsPath"));
		setUpdateLocationData(AdminTestUtil.getPropertyValue("updateLocationData"));
		setDecommisionMachinePath(AdminTestUtil.getPropertyValue("decommisionMachinePath"));
		setDecommisionDevicePath(AdminTestUtil.getPropertyValue("decommisionDevicePath"));
		setDecommisionRegCenterPath(AdminTestUtil.getPropertyValue("decommisionRegCenterPath"));
		setDeviceValidatePath(AdminTestUtil.getPropertyValue("deviceValidatePath"));
		setFilterIndividualTypePath(AdminTestUtil.getPropertyValue("filterIndividualTypePath"));
		setFilterHolidaysPath(AdminTestUtil.getPropertyValue("filterHolidaysPath"));
		setSearchRegCenterTypePath(AdminTestUtil.getPropertyValue("searchRegCenterTypePath"));
		setFilterRegCenterTypePath(AdminTestUtil.getPropertyValue("filterRegCenterTypePath"));
		setDeviceRegisterPath(AdminTestUtil.getPropertyValue("deviceRegisterPath"));
		setDeviceValidateHistoryPath(AdminTestUtil.getPropertyValue("deviceValidateHistoryPath"));
		setDeviceDeRegisterPath(AdminTestUtil.getPropertyValue("deviceDeRegisterPath"));
		setRegisterDevProviderPath(AdminTestUtil.getPropertyValue("registerDevProviderPath"));
		setUpdateDevProviderPath(AdminTestUtil.getPropertyValue("updateDevProviderPath"));
		setUpdateDeviceStatusPath(AdminTestUtil.getPropertyValue("updateDeviceStatusPath"));
		setRegisterFTPPath(AdminTestUtil.getPropertyValue("registerFTPPath"));
		setUpdateFTPPath(AdminTestUtil.getPropertyValue("updateFTPPath"));
		setMapDeviceRegCenterPath((AdminTestUtil.getPropertyValue("mapDeviceRegCenterPath")));
		setMapUserRegistrationCenterPath((AdminTestUtil.getPropertyValue("mapUserRegistrationCenterPath")));
		setRegisterMDSPath(AdminTestUtil.getPropertyValue("registerMDSPath"));
		setUpdateMDSPath(AdminTestUtil.getPropertyValue("updateMDSPath"));
		setUnmapDeviceRegCenterPath(AdminTestUtil.getPropertyValue("unmapDeviceRegCenterPath"));
		setMapMachineRegCenterPath(AdminTestUtil.getPropertyValue("mapMachineRegCenterPath"));
		setUnmapMachineRegCenterPath(AdminTestUtil.getPropertyValue("unmapMachineRegCenterPath"));
		setCreateMachinePath(AdminTestUtil.getPropertyValue("createMachinePath"));
		setUpdateMachinePath(AdminTestUtil.getPropertyValue("updateMachinePath"));
		setUnmapUserRegistrationCenterPath(AdminTestUtil.getPropertyValue("unmapUserRegistrationCenterPath"));
		setCreateDevicePath(AdminTestUtil.getPropertyValue("createDevicePath"));
		setCreateDocumentTypePath(AdminTestUtil.getPropertyValue("createDocumentTypePath"));
		setUpdateDocumentTypePath(AdminTestUtil.getPropertyValue("updateDocumentTypePath"));
		setFetchPacketStatusPath(AdminTestUtil.getPropertyValue("fetchPacketStatusPath"));
		setUpdateDevicePath(AdminTestUtil.getPropertyValue("updateDevicePath"));
		setFetchHolidayLocationPath(AdminTestUtil.getPropertyValue("fetchHolidayLocationPath"));
		setFetchRegCenterWorkingDays_kernelPath(AdminTestUtil.getPropertyValue("fetchRegCenterWorkingDays_kernelPath"));
		setFetchRegCenterExceptionalHolidays_kernelPath(AdminTestUtil.getPropertyValue("fetchRegCenterExceptionalHolidays_kernelPath"));
		
		setUpdateHolidayPath(AdminTestUtil.getPropertyValue("updateHolidayPath"));
		setCreateTitlePath(AdminTestUtil.getPropertyValue("createTitlePath"));
		setUpdateTitlePath(AdminTestUtil.getPropertyValue("updateTitlePath"));
		setCreateMachineTypePath(AdminTestUtil.getPropertyValue("createMachineTypePath"));
		setUpdateMachineTypePath(AdminTestUtil.getPropertyValue("updateMachineTypePath"));
		setCreateDeviceSpecificationPath(AdminTestUtil.getPropertyValue("createDeviceSpecificationPath"));
		setUpdateDeviceSpecificationPath(AdminTestUtil.getPropertyValue("updateDeviceSpecificationPath"));
		setCreateMachineSpecificationPath(AdminTestUtil.getPropertyValue("createMachineSpecificationPath"));
		setUpdateMachineSpecificationPath(AdminTestUtil.getPropertyValue("updateMachineSpecificationPath"));
		setCreateRegCenterTypePath(AdminTestUtil.getPropertyValue("createRegCenterTypePath"));
		setUpdateRegCenterTypePath(AdminTestUtil.getPropertyValue("updateRegCenterTypePath"));
		setCreateTemplateFileFormatPath(AdminTestUtil.getPropertyValue("createTemplateFileFormatPath"));
		setUpdateTemplateFileFormatPath(AdminTestUtil.getPropertyValue("updateTemplateFileFormatPath"));
		setCreateTemplatePath(AdminTestUtil.getPropertyValue("createTemplatePath"));

		setUpdateDocumentCategoryPath(AdminTestUtil.getPropertyValue("updateDocumentCategoryPath"));
		setCreateDocumentCategoryPath(AdminTestUtil.getPropertyValue("createDocumentCategoryPath"));
		setUpdateGenderPath(AdminTestUtil.getPropertyValue("updateGenderPath"));
		setCreateGenderPath(AdminTestUtil.getPropertyValue("createGenderPath"));
		setCreateHolidayPath(AdminTestUtil.getPropertyValue("createHolidayPath"));
		setUpdateTemplatePath(AdminTestUtil.getPropertyValue("updateTemplatePath"));
		setCreateTemplateTypePath(AdminTestUtil.getPropertyValue("createTemplateTypePath"));
		setCreateDeviceTypePath(AdminTestUtil.getPropertyValue("createDeviceTypePath"));
		setUpdateDeviceTypePath(AdminTestUtil.getPropertyValue("updateDeviceTypePath"));
		setCreateIndividualTypePath(AdminTestUtil.getPropertyValue("createIndividualTypePath"));
		setUpdateIndividualTypePath(AdminTestUtil.getPropertyValue("updateIndividualTypePath"));
	}

	private void setFilePathFromTestdataFileName(File filePath, String testDataPath) {
		String[] folderList = filePath.getName().split(Pattern.quote("."));
		String temp = "";
		for (int i = 1; i < folderList.length - 2; i++) {
			temp = temp + "/" + folderList[i];
		}
		String testDataFolderName = "";
		String moduleFolderName = "";
		if (testDataPath.contains("\\")) {
			String[] list = testDataPath.split(Pattern.quote("\\\\"));
			testDataFolderName = list[1];
		} else if (testDataPath.contains("/")) {
			String[] list = testDataPath.split(Pattern.quote("/"));
			moduleFolderName = list[0];
			testDataFolderName = list[1];
		}
		setTestDataFolderName(testDataFolderName);
		setModuleFolderName(moduleFolderName);
		scenarioPath = temp;
		setScenarioPath(scenarioPath);
		loadErrorsData(getErrorsConfigPath());
	}

	/**
	 * The method load yml error test data
	 * 
	 * @param path
	 */
	@SuppressWarnings("unchecked")
	private void loadErrorsData(String path) {
		try {
			Yaml yaml = new Yaml();
			InputStream inputStream = new FileInputStream(
					new File(RunConfigUtil.getResourcePath() + path).getAbsoluteFile());
			ErrorsDto.setErrors((Map<String, Map<String, Map<String, String>>>) yaml.load(inputStream));
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	public String getAdminSearchTemplateDetails() {
		return adminSearchTemplateDetails;
	}

	public void setAdminSearchTemplateDetails(String adminSearchTemplateDetails) {
		this.adminSearchTemplateDetails = adminSearchTemplateDetails;
	}


	
	
	@Override
	public String getSearchDocCategories() {
		return searchDocCategories;
	}
	
	public String getAdminUpdateRegistrationCentrePath() {
		return adminUpdateRegistrationCentrePath;
	}

	public void setAdminUpdateRegistrationCentrePath(String adminUpdateRegistrationCentrePath) {
		this.adminUpdateRegistrationCentrePath = adminUpdateRegistrationCentrePath;
	}
	


	public String getAdminRegistrationCentreSearchPath() {
		return adminRegistrationCentreSearchPath;
	}

	public void setAdminRegistrationCentreSearchPath(String adminRegistrationCentreSearchPath) {
		this.adminRegistrationCentreSearchPath = adminRegistrationCentreSearchPath;
	}


	public String getAdminIndividualTypesSearch() {
		return adminIndividualTypesSearch;
	}

	public void setAdminIndividualTypesSearch(String adminIndividualTypesSearch) {
		this.adminIndividualTypesSearch = adminIndividualTypesSearch;
	}

	public void setSearchDocCategories(String searchDocCategories) {
		this.searchDocCategories = searchDocCategories;
	}
	public String getAdminMachineTypeSearchPath() {
		return adminMachineTypeSearchPath;
	}

	public void setAdminMachineTypeSearchPath(String adminMachineTypeSearchPath) {
		this.adminMachineTypeSearchPath = adminMachineTypeSearchPath;
	}

	public String getAdminCreateRegistrationCentrePath() {
		return adminCreateRegistrationCentrePath;
	}

	public void setAdminCreateRegistrationCentrePath(String adminCreateRegistrationCentrePath) {
		this.adminCreateRegistrationCentrePath = adminCreateRegistrationCentrePath;
	}
	
	@Override
	public String getSearchValidDocumentPath() {
		return searchValidDocumentPath;
	}

	public void setSearchValidDocumentPath(String searchValidDocumentPath) {
		this.searchValidDocumentPath = searchValidDocumentPath;
	}
	@Override
	public String getModuleFolderName() {
		// TODO Auto-generated method stub
		return this.moduleFolderName;
	}

	@Override
	public void setModuleFolderName(String moduleFolderName) {
		this.moduleFolderName = moduleFolderName;

	}
	@Override
	public String getErrorsConfigPath() {

		return "admin/TestData/RunConfig/adminErrorCodeMsg.yml";
	}

	@Override
	public String getTestType() {
		// TODO Auto-generated method stub
		return this.testType;
	}

	@Override
	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getAdminEndPointUrl() {
		return adminEndPointUrl;
	}

	public void setAdminEndPointUrl(String adminEndPointUrl) {
		this.adminEndPointUrl = adminEndPointUrl.replace("$endpoint$", System.getProperty("env.endpoint"));
	}

	public String getAdminCreateRegCentrePath() {
		return adminCreateRegCentrePath;
	}

	
	public void setAdminCreateRegCentrePath(String adminCreateRegCentrePath) {
		this.adminCreateRegCentrePath = adminCreateRegCentrePath;
	}

	@Override
	public String getScenarioPath() {
		// TODO Auto-generated method stub
		return this.scenarioPath;
	}

	@Override
	public void setScenarioPath(String scenarioPath) {
		this.scenarioPath = scenarioPath;

	}

	@Override
	public String getTestDataPath() {
		// TODO Auto-generated method stub
		return this.testDataPath;
	}

	@Override
	public void setTestDataPath(String testDataPath) {
		this.testDataPath = testDataPath;
	}

	@Override
	public String getTestDataFolderName() {
		// TODO Auto-generated method stub
		return this.testDataFolderName;
	}

	@Override
	public void setTestDataFolderName(String testDataFolderName) {
		this.testDataFolderName = testDataFolderName;

	}
	
	@Override
	public String getSearchDocumentTypePath() {
		return searchDocumentTypePath;
	}
	@Override
	public void setSearchDocumentTypePath(String searchDocumentTypePath) {
		this.searchDocumentTypePath = searchDocumentTypePath;
	}
	@Override
	public String getSearchBlackListedWords() {
		return searchBlackListedWordsPath;
	}
	@Override
	public void setSearchBlackListedWords(String searchBlackListedWordsPath) {
		this.searchBlackListedWordsPath = searchBlackListedWordsPath;
	}
	@Override
	public String getFilterBlackListedWordsPath() {
		return filterBlackListedWordsPath;
	}
	@Override
	public void setFilterBlackListedWordsPath(String filterBlackListedWordsPath) {
		this.filterBlackListedWordsPath = filterBlackListedWordsPath;
	}
	@Override
	public String getFilterDocumentTypePath() {
		return filterDocumentTypePath;
	}
	@Override
	public void setFilterDocumentTypePath(String filterDocumentTypePath) {
		this.filterDocumentTypePath = filterDocumentTypePath;
	}
	@Override
	public String getFilterMachinesPath() {
		return filterMachinesPath;
	}
	@Override
	public void setFilterMachinesPath(String filterMachinesPath) {
		this.filterMachinesPath = filterMachinesPath;
	}
	@Override
	public String getSearchLocationDataPath() {
		return searchLocationPath;
	}
	@Override
	public void setSearchLocationDataPath(String searchLocationPath) {
		this.searchLocationPath = searchLocationPath;
	}
	@Override
	public String getFilterLocationPath() {
		return filterLocationPath;
	}
	@Override
	public void setFilterLocationPath(String filterLocationPath) {
		this.filterLocationPath = filterLocationPath;
	}
	@Override
	public String getCreateBlackListedWordsPath() {
		return createBlackListedWordsPath;
	}
	@Override
	public void setCreateBlackListedWordsPath(String createBlackListedWordsPath) {
		this.createBlackListedWordsPath = createBlackListedWordsPath;
	}
	@Override
	public String getCreateLocationDataPath() {
		return createLocationDataPath;
	}
	@Override
	public void setCreateLocationDataPath(String createLocationDataPath) {
		this.createLocationDataPath = createLocationDataPath;
	}
	@Override
	public String getUpdateBlackListedWordsPath() {
		return updateBlackListedWordsPath;
	}
	public void setUpdateBlackListedWordsPath(String updateBlackListedWordsPath) {
		this.updateBlackListedWordsPath = updateBlackListedWordsPath;
	}
	@Override
	public String getUpdateLocationData() {
		return updateLocationData;
	}
	public void setUpdateLocationData(String updateLocationData) {
		this.updateLocationData = updateLocationData;
	}
	@Override
	public String getDecommisionMachinePath() {
		return decommisionMachinePath;
	}
	public void setDecommisionMachinePath(String decommisionMachinePath) {
		this.decommisionMachinePath = decommisionMachinePath;
	}
	@Override
	public String getEndPointUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEndPointUrl(String endPointUrl) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEkycPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEkycPath(String ekycPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEncryptUtilBaseUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEncryptUtilBaseUrl(String encryptUtilBaseUrl) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEncryptionPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEncryptionPath(String encryptionPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEncodePath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEncodePath(String encodePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDecodePath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDecodePath(String decodePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSrcPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSrcPath(String srcPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthPath(String authPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getInternalAuthPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInternalAuthPath(String internalAuthPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getOtpPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOtpPath(String otpPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUserDirectory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUserDirectory() {

	}

	@Override
	public String getIdRepoEndPointUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoEndPointUrl(String idRepoEndPointUrl) {
		// TODO Auto-generated method stub
	}


	@Override
	public String getGenerateUINPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGenerateUINPath(String generateUINPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getIdRepoRetrieveDataPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoRetrieveDataPath(String idRepoRetrieveDataPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getIdRepoCreateUINRecordPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoCreateUINRecordPath(String idRepoCreateUINRecordPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getStoreUINDataPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStoreUINDataPath(String storeUINDataPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEncodeFilePath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEncodeFilePath(String encodeFile) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDecodeFilePath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDecodeFilePath(String decodeFilePath) {
		// TODO Auto-generated method stub

	}	

	

	@Override
	public String getVidGenPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVidGenPath(String vidGenPath) {
		// TODO Auto-generated method stub

	}
	@Override
	public String getAuthVersion() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void setAuthVersion(String authVersion) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getClientidsecretkey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClientidsecretkey(String clientidsecretkey) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getGenerateVIDPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGenerateVIDPath(String generateVIDPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getIdRepoCreateVIDRecordPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoCreateVIDRecordPath(String idRepoCreateVIDRecordPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getIdRepoUpdateVIDStatusPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoUpdateVIDStatusPath(String IdRepoUpdateVIDStatusPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getIdRepoVersion() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void setIdRepoVersion(String idRepoVersion) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDecryptPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDecryptPath(String decryptPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setUinIdentityMapper(String uinIdentityMapper) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUinIdentityMapper() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInternalEncryptionPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInternalEncryptionPath(String internalEncryptionPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getValidateSignaturePath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValidateSignaturePath(String validateSignaturePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEncryptionPort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEncryptionPort(String encryptionPort) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getIdRepoRetrieveIdentityByUin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoRetrieveIdentityByUin(String idRepoRetrieveIdentityByUin) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getIdRepoRetrieveUINByVIDPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoRetrieveUINByVIDPath(String idRepoRetrieveIdentityByRid) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getIdRepoRetrieveIdentityByRid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoRetrieveIdentityByRid(String idRepoRetrieveIdentityByRid) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getIdRepoRegenerateVID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoRegenerateVID(String idRepoRegenerateVID) {
		// TODO Auto-generated method stub

	}
	

	@Override
	public String getDeviceSearchPath() {
	    return deviceSearchPath;
	}

	@Override
	public void setDeviceSearchPath(String deviceSearchPath) {
		this.deviceSearchPath=deviceSearchPath;
		
	}

	@Override
	public String getSearchMachinePath() {
		return searchMachinePath;
	}

	@Override
	public void setSearchMachinePath(String  searchMachinePath) {
		this.searchMachinePath=searchMachinePath;
		
	}

	@Override
	public String getDeviceFilterPath() {
		return deviceFilterPath;
	}

	@Override
	public void setDeviceFilterPath(String deviceFilterPath) {
		this.deviceFilterPath=deviceFilterPath;		
	}

	@Override
	public String getDeviceSpecSearchPath() {
		return deviceSpecSearchPath;
	}

	@Override
	public void setDeviceSpecSearchPath(String deviceSpecSearchPath) {
		this.deviceSpecSearchPath=deviceSpecSearchPath;
		
	}

	@Override
	public String getDeviceTypeSearchPath() {
		return this.deviceTypeSearchPath;
	}

	@Override
	public void setDeviceTypeSearchPath(String deviceTypeSearchPath) {
		this.deviceTypeSearchPath = deviceTypeSearchPath;
		
	}

	@Override
	public String getTitleSearchPath() {
		return this.titleSearchPath;
	}

	@Override
	public void setTitleSearchPath(String titleSearchPath) {
		this.titleSearchPath = titleSearchPath;		
	}

	@Override
	public String getTitleFilterPath() {
		return titleFilterPath;
	}

	@Override
	public void setTitleFilterPath(String titleFilterPath) {
		this.titleFilterPath=titleFilterPath;
	}

	public String getAdminIndividualTypesSearchPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAdminIndividualTypesSearchPath(String adminMachineTypeSearchPath) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setHolidaySearchPath(String holidaySearchPath) {
		this.holidaySearchPath=holidaySearchPath;
		
	}

	@Override
	public String getAdminSearchTemplateDetailsPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAdminSearchTemplateDetailsPath(String adminSearchTemplateDetailsPath) {
		
	}

	@Override
	public String getHolidaySearchPath() {
		return holidaySearchPath;
	}
	@Override
	public String getFilterTempateDetailsPath() {
		return FilterTempateDetailsPath;
	}
	public String getFilterDocCategory() {
		return filterDocCategory;
	}

	@Override
	public String getDeviceTypeFilterPath() {
		return deviceTypeFilterPath;
	}

	@Override
	public void setDeviceTypeFilterPath(String deviceTypeFilterPath) {
		this.deviceTypeFilterPath=deviceTypeFilterPath;
		
	}

	public void setFilterDocCategory(String filterDocCategory) {
		this.filterDocCategory = filterDocCategory;
	}




	public String getAdminGenderSearchPath() {
		return adminGenderSearchPath;
	}

	
	public void setAdminGenderSearchPath(String adminGenderSearchPath) {
		this.adminGenderSearchPath = adminGenderSearchPath;
	}
	
	public String getAdminGenderFilterPath() {
		return adminGenderFilterPath;
	}

	public void setAdminGenderFilterPath(String adminGenderFilterPath) {
		this.adminGenderFilterPath = adminGenderFilterPath;
	}
	

	public String getAdminRegistrationCentreFilterPath() {
		return adminRegistrationCentreFilterPath;
	}

	public void setAdminRegistrationCentreFilterPath(String adminRegistrationCentreFilterPath) {
		this.adminRegistrationCentreFilterPath = adminRegistrationCentreFilterPath;
	}

	

	@Override
	public String getDeviceSpecFilterPath() {
		return deviceSpecFilterPath;
	}

	@Override
	public void setDeviceSpecFilterPath(String deviceSpecFilterPath) {
		this.deviceSpecFilterPath=deviceSpecFilterPath;
		
	}
	public void setFilterTempateDetailsPath(String filterTempateDetailsPath) {
		FilterTempateDetailsPath = filterTempateDetailsPath;
	}
	@Override
	public String getFilterDocCatTypMapping() {
		return filterDocCatTypMapping;
	}

	public void setFilterDocCatTypMapping(String filterDocCatTypMapping) {
		this.filterDocCatTypMapping = filterDocCatTypMapping;
	}
	public String getMapDocumentCategoryAndDocumentType() {
		return MapDocumentCategoryAndDocumentType;
	}

	public void setMapDocumentCategoryAndDocumentType(String mapDocumentCategoryAndDocumentType) {
		MapDocumentCategoryAndDocumentType = mapDocumentCategoryAndDocumentType;
	}

	@Override
	public String MapDocumentCategoryAndDocumentType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getSearchMachineSpec() {
		return searchMachineSpec;
	}

	public void setSearchMachineSpec(String searchMachineSpec) {
		this.searchMachineSpec = searchMachineSpec;
	}
	@Override
	public String getFilterMachineSpec() {
		return filterMachineSpec;
	}

	public void setFilterMachineSpec(String filterMachineSpec) {
		this.filterMachineSpec = filterMachineSpec;
	}
	@Override
	public String getSetZoneHierarchy() {
		return setZoneHierarchy;
	}

	public void setSetZoneHierarchy(String setZoneHierarchy) {
		this.setZoneHierarchy = setZoneHierarchy;
	}
	@Override
	public String getSetGetZoneNameBasedOnUserIDAndLangCode() {
		return setGetZoneNameBasedOnUserIDAndLangCode;
	}

	public void setSetGetZoneNameBasedOnUserIDAndLangCode(String setGetZoneNameBasedOnUserIDAndLangCode) {
		this.setGetZoneNameBasedOnUserIDAndLangCode = setGetZoneNameBasedOnUserIDAndLangCode;
	}
	@Override
	public String getSetGetLeafZones() {
		return setGetLeafZones;
	}

	public void setSetGetLeafZones(String setGetLeafZones) {
		this.setGetLeafZones = setGetLeafZones;
	}


	public String getUnmapDocCategoryType() {
		return unmapDocCategoryType;
	}

	public void setUnmapDocCategoryType(String unmapDocCategoryType) {
		this.unmapDocCategoryType = unmapDocCategoryType;
	}
	@Override
	public String getDecommisionDevicePath() {
		return decommisionDevicePath;
	}

	public void setDecommisionDevicePath(String decommisionDevicePath) {
		this.decommisionDevicePath = decommisionDevicePath;
	}
	@Override
	public String getDecommisionRegCenterPath() {
		return decommisionRegCenterPath;
	}

	public void setDecommisionRegCenterPath(String decommisionRegCenterPath) {
		this.decommisionRegCenterPath = decommisionRegCenterPath;
	}

	@Override
	public String getIdaInternalOtpPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdaInternalOtpPath(String internalPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdRepoDeactivateVIDs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoDeactivateVIDs(String idRepoDeactivateVIDs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdRepoReactivateVIDs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdRepoReactivateVIDs(String idRepoReactivateVIDs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdaInternalAuthTransactionWithVID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdaInternalAuthTransactionWithVID(String idaInternalAuthTransactionWithVID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdaInternalAuthTransactionWithUIN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdaInternalAuthTransactionWithUIN(String idaInternalAuthTransactionWithUIN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdaInternalUpdateAuthTypePath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdaInternalUpdateAuthTypePath(String idaInternalUpdateAuthTypePath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdaInternalRetrieveAuthTypeStatusPathForUIN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdaInternalRetrieveAuthTypeStatusPathForUIN(String idaInternalRetrieveAuthTypeStatusPathForUIN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdaInternalRetrieveAuthTypeStatusPathForVID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdaInternalRetrieveAuthTypeStatusPathForVID(String idaInternalRetrieveAuthTypeStatusPathForVID) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getDeviceValidatePath() {
		return deviceValidatePath;
	}

	public void setDeviceValidatePath(String deviceValidatePath) {
		this.deviceValidatePath = deviceValidatePath;
	}
	
	@Override
	public String getFilterIndividualTypePath() {
		return filterIndividualTypePath;
	}

	public void setFilterIndividualTypePath(String filterIndividualTypePath) {
		this.filterIndividualTypePath = filterIndividualTypePath;
	}
	
	@Override
	public String getFilterHolidaysPath() {
		return filterHolidaysPath;
	}

	public void setFilterHolidaysPath(String filterHolidaysPath) {
		this.filterHolidaysPath = filterHolidaysPath;
	}
	
	@Override
	public String getSearchRegCenterTypePath() {
		return searchRegCenterTypePath;
	}

	public void setSearchRegCenterTypePath(String searchRegCenterTypePath) {
		this.searchRegCenterTypePath = searchRegCenterTypePath;
	}
	
	@Override
	public String getFilterRegCenterTypePath() {
		return filterRegCenterTypePath;
	}

	public void setFilterRegCenterTypePath(String filterRegCenterTypePath) {
		this.filterRegCenterTypePath = filterRegCenterTypePath;
	}
	
	@Override
	public String getDeviceRegisterPath() {
		return deviceRegisterPath;
	}

	public void setDeviceRegisterPath(String deviceRegisterPath) {
		this.deviceRegisterPath = deviceRegisterPath;
	}
	
	@Override
	public String getDeviceValidateHistoryPath() {
		return deviceValidateHistoryPath;
	}
	
	public void setDeviceValidateHistoryPath(String deviceValidateHistoryPath) {
		this.deviceValidateHistoryPath = deviceValidateHistoryPath;
	}
	
	@Override
	public String getDeviceDeRegisterPath() {
		return deviceDeRegisterPath;
	}

	public void setDeviceDeRegisterPath(String deviceDeRegisterPath) {
		this.deviceDeRegisterPath = deviceDeRegisterPath;
	}
	
	@Override
	public String getRegisterDevProviderPath() {
		return registerDevProviderPath;
	}

	public void setRegisterDevProviderPath(String registerDevProviderPath) {
		this.registerDevProviderPath = registerDevProviderPath;
	}
	
	@Override
	public String getUpdateDevProviderPath() {
		return updateDevProviderPath;
	}

	public void setUpdateDevProviderPath(String updateDevProviderPath) {
		this.updateDevProviderPath = updateDevProviderPath;
	}
	
	@Override
	public String getUpdateDeviceStatusPath() {
		return updateDeviceStatusPath;
	}

	public void setUpdateDeviceStatusPath(String updateDeviceStatusPath) {
		this.updateDeviceStatusPath = updateDeviceStatusPath;
	}

	@Override
	public String getRegisterFTPPath() {
		return registerFTPPath;
	}

	public void setRegisterFTPPath(String registerFTPPath) {
		this.registerFTPPath = registerFTPPath;
	}
	
	@Override
	public String getUpdateFTPPath() {
		return updateFTPPath;
	}

	public void setUpdateFTPPath(String updateFTPPath) {
		this.updateFTPPath = updateFTPPath;
	}
	
	@Override
	public String getMapDeviceRegCenterPath() {
		return mapDeviceRegCenterPath;
	}

	public void setMapDeviceRegCenterPath(String mapDeviceRegCenterPath) {
		this.mapDeviceRegCenterPath = mapDeviceRegCenterPath;
	}
	
	@Override
	public String getMapUserRegistrationCenterPath() {
		return mapUserRegistrationCenterPath;
	}

	public void setMapUserRegistrationCenterPath(String mapUserRegistrationCenterPath) {
		this.mapUserRegistrationCenterPath = mapUserRegistrationCenterPath;
	}
	
	@Override
	public String getUnmapUserRegistrationCenterPath() {
		return unmapUserRegistrationCenterPath;
	}

	public void setUnmapUserRegistrationCenterPath(String unmapUserRegistrationCenterPath) {
		this.unmapUserRegistrationCenterPath = unmapUserRegistrationCenterPath;
	}
	
	@Override
	public String getRegisterMDSPath() {
		return registerMDSPath;
	}

	public void setRegisterMDSPath(String registerMDSPath) {
		this.registerMDSPath = registerMDSPath;
	}
	
	@Override
	public String getUpdateMDSPath() {
		return updateMDSPath;
	}

	public void setUpdateMDSPath(String updateMDSPath) {
		this.updateMDSPath = updateMDSPath;
	}
	
	@Override
	public String getUnmapDeviceRegCenterPath() {
		return unmapDeviceRegCenterPath;
	}

	public void setUnmapDeviceRegCenterPath(String unmapDeviceRegCenterPath) {
		this.unmapDeviceRegCenterPath = unmapDeviceRegCenterPath;
	}
	
	@Override
	public String getMapMachineRegCenterPath() {
		return mapMachineRegCenterPath;
	}

	public void setMapMachineRegCenterPath(String mapMachineRegCenterPath) {
		this.mapMachineRegCenterPath = mapMachineRegCenterPath;
	}
	

	@Override
	public String getUnmapMachineRegCenterPath() {
		return unmapMachineRegCenterPath;
	}

	public void setUnmapMachineRegCenterPath(String unmapMachineRegCenterPath) {
		this.unmapMachineRegCenterPath = unmapMachineRegCenterPath;
	}
	
	@Override
	public String getCreateMachinePath() {
		return createMachinePath;
	}

	public void setCreateMachinePath(String createMachinePath) {
		this.createMachinePath = createMachinePath;
	}
	
	@Override
	public String getUpdateMachinePath() {
		return updateMachinePath;
	}

	public void setUpdateMachinePath(String updateMachinePath) {
		this.updateMachinePath = updateMachinePath;
	}

	@Override
	public String getCreateDevicePath() {
		return createDevicePath;
	}

	public void setCreateDevicePath(String createDevicePath) {
		this.createDevicePath = createDevicePath;
	}
	@Override
	public String getCreateDocumentTypePath() {
		return createDocumentTypePath;
	}

	public void setCreateDocumentTypePath(String createDocumentTypePath) {
		this.createDocumentTypePath = createDocumentTypePath;
	}
	@Override
	public String getUpdateDocumentTypePath() {
		return updateDocumentTypePath;
	}

	public void setUpdateDocumentTypePath(String updateDocumentTypePath) {
		this.updateDocumentTypePath = updateDocumentTypePath;
	}
	@Override
	public String getFetchPacketStatusPath() {
		return fetchPacketStatusPath;
	}

	public void setFetchPacketStatusPath(String fetchPacketStatusPath) {
		this.fetchPacketStatusPath = fetchPacketStatusPath;
	}
	@Override
	public String getUpdateDevicePath() {
		return updateDevicePath;
	}

	public void setUpdateDevicePath(String updateDevicePath) {
		this.updateDevicePath = updateDevicePath;
	}	
	@Override
	public String getFetchHolidayLocationPath() {
		return fetchHolidayLocationPath;
	}

	public void setFetchHolidayLocationPath(String fetchHolidayLocationPath) {
		this.fetchHolidayLocationPath = fetchHolidayLocationPath;
	}

	@Override
	public String getFetchRegCenterWorkingDays_kernelPath() {
		return fetchRegCenterWorkingDays_kernelPath;
	}

	public void setFetchRegCenterWorkingDays_kernelPath(String fetchRegCenterWorkingDays_kernelPath) {
		this.fetchRegCenterWorkingDays_kernelPath = fetchRegCenterWorkingDays_kernelPath;
	}

	@Override
	public String getFetchRegCenterExceptionalHolidays_kernelPath() {
		return fetchRegCenterExceptionalHolidays_kernelPath;
	}

	public void setFetchRegCenterExceptionalHolidays_kernelPath(String fetchRegCenterExceptionalHolidays_kernelPath) {
		this.fetchRegCenterExceptionalHolidays_kernelPath = fetchRegCenterExceptionalHolidays_kernelPath;
	}

	@Override
	public String getCryptomanagerEncrypt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCryptomanagerEncrypt(String cryptomanagerEncrypt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSplitEncryptedData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSplitEncryptedData(String splitEncryptedData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAuthManagerUserIdPwd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthManagerUserIdPwd(String authManagerUserIdPwd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResidentGenerateVID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUserIdPwd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUserIdPwd(String userIdPwd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResidentGenerateVID(String residentGenerateVID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResidentRevokeVID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResidentRevokeVID(String residentRevokeVID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResidentAuthHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResidentAuthHistory(String residentAuthHistory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResidentAuthLock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResidentAuthLock(String residentAuthLock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResidentAuthUnlock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResidentAuthUnlock(String residentAuthUnlock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResidenteUin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResidenteUin(String residenteUin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResidentPrintUin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResidentPrintUin(String residentPrintUin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResidentUpdateUin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResidentUpdateUin(String residentUpdateUin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResidentCheckStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResidentCheckStatus(String residentCheckStatus) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
   	public String getUpdateHolidayPath() {
   		return updateHolidayPath;
   	}

   	public void setUpdateHolidayPath(String updateHolidayPath) {
   		this.updateHolidayPath = updateHolidayPath;
   	}
   	@Override
	public String getCreateTitlePath() {
		return createTitlePath;
	}

	public void setCreateTitlePath(String createTitlePath) {
		this.createTitlePath = createTitlePath;
	}
	
	@Override
	public String getUpdateTitlePath() {
		return updateTitlePath;
	}

	public void setUpdateTitlePath(String updateTitlePath) {
		this.updateTitlePath = updateTitlePath;
	}
	@Override
	public String getCreateMachineTypePath() {
		return createMachineTypePath;
	}
	
	public void setCreateMachineTypePath(String createMachineTypePath) {
		this.createMachineTypePath = createMachineTypePath;
	}
	
	@Override
	public String getCreateDeviceSpecificationPath() {
		return createDeviceSpecificationPath;
	}

	public void setCreateDeviceSpecificationPath(String createDeviceSpecificationPath) {
		this.createDeviceSpecificationPath = createDeviceSpecificationPath;
	}
	
	@Override
	public String getUpdateMachineTypePath() {
		return updateMachineTypePath;
	}

	public void setUpdateMachineTypePath(String updateMachineTypePath) {
		this.updateMachineTypePath = updateMachineTypePath;
	}
	
	@Override
	public String getUpdateDeviceSpecificationPath() {
		return updateDeviceSpecificationPath;
	}

	public void setUpdateDeviceSpecificationPath(String updateDeviceSpecificationPath) {
		this.updateDeviceSpecificationPath = updateDeviceSpecificationPath;
	}
	@Override
	public String getCreateMachineSpecificationPath() {
		return createMachineSpecificationPath;
	}

	public void setCreateMachineSpecificationPath(String createMachineSpecificationPath) {
		this.createMachineSpecificationPath = createMachineSpecificationPath;
	}
	
	@Override
	public String getUpdateMachineSpecificationPath() {
		return updateMachineSpecificationPath;
	}

	public void setUpdateMachineSpecificationPath(String updateMachineSpecificationPath) {
		this.updateMachineSpecificationPath = updateMachineSpecificationPath;
	}
	
	@Override
	public String getCreateRegCenterTypePath() {
		return createRegCenterTypePath;
	}

	public void setCreateRegCenterTypePath(String createRegCenterTypePath) {
		this.createRegCenterTypePath = createRegCenterTypePath;
	}
	
	@Override
	public String getUpdateRegCenterTypePath() {
		return updateRegCenterTypePath;
	}

	public void setUpdateRegCenterTypePath(String updateRegCenterTypePath) {
		this.updateRegCenterTypePath = updateRegCenterTypePath;
	}
	@Override
	public String getCreateTemplateFileFormatPath() {
		return createTemplateFileFormatPath;
	}

	public void setCreateTemplateFileFormatPath(String createTemplateFileFormatPath) {
		this.createTemplateFileFormatPath = createTemplateFileFormatPath;
	}
	@Override
	public String getUpdateTemplateFileFormatPath() {
		return updateTemplateFileFormatPath;
	}

	public void setUpdateTemplateFileFormatPath(String updateTemplateFileFormatPath) {
		this.updateTemplateFileFormatPath = updateTemplateFileFormatPath;
	}
	@Override
	public String getCreateTemplatePath() {
		return createTemplatePath;
	}

	public void setCreateTemplatePath(String createTemplatePath) {
		this.createTemplatePath = createTemplatePath;
	}

	@Override
	public String getUpdateDocumentCategoryPath() {
		// TODO Auto-generated method stub
		return updateDocumentCategoryPath;
	}
	public void setUpdateDocumentCategoryPath(String updateDocumentCategoryPath) {
		this.updateDocumentCategoryPath = updateDocumentCategoryPath;
	}

	@Override
	public String getCreateDocumentCategoryPath() {
		// TODO Auto-generated method stub
		return createDocumentCategoryPath;
	}
	public void setCreateDocumentCategoryPath(String createDocumentCategoryPath) {
		this.createDocumentCategoryPath = createDocumentCategoryPath;
	}

	@Override
	public String getUpdateGenderPath() {
		// TODO Auto-generated method stub
		return updateGenderPath;
	}
	public void setUpdateGenderPath(String updateGenderPath) {
		this.updateGenderPath = updateGenderPath;
	}

	@Override
	public String getCreateGenderPath() {
		// TODO Auto-generated method stub
		return createGenderPath;
	}
	public void setCreateGenderPath(String createGenderPath) {
		this.createGenderPath=createGenderPath;
	}
	
	@Override
	public String getUpdateTemplatePath() {
		return updateTemplatePath;
	}


	public void setUpdateTemplatePath(String updateTemplatePath) {
		this.updateTemplatePath = updateTemplatePath;
	}
	@Override
	public String getCreateTemplateTypePath() {
		return createTemplateTypePath;
	}

	public void setCreateTemplateTypePath(String createTemplateTypePath) {
		this.createTemplateTypePath = createTemplateTypePath;
	}
	@Override
	public String getCreateDeviceTypePath() {
		return createDeviceTypePath;
	}

	public void setCreateDeviceTypePath(String createDeviceTypePath) {
		this.createDeviceTypePath = createDeviceTypePath;
	}
	@Override
	public String getUpdateDeviceTypePath() {
		return updateDeviceTypePath;
	}

	public void setUpdateDeviceTypePath(String updateDeviceTypePath) {
		this.updateDeviceTypePath = updateDeviceTypePath;
	}
	@Override
	public String getCreateIndividualTypePath() {
		return createIndividualTypePath;
	}

	public void setCreateIndividualTypePath(String createIndividualTypePath) {
		this.createIndividualTypePath = createIndividualTypePath;
	}
	@Override
	public String getUpdateIndividualTypePath() {
		return updateIndividualTypePath;
	}

	public void setUpdateIndividualTypePath(String updateIndividualTypePath) {
		this.updateIndividualTypePath = updateIndividualTypePath;
	}

	@Override
	public String getCreateHolidayPath() {
		// TODO Auto-generated method stub
		return createHolidayPath;
	}

	public void setCreateHolidayPath(String createHolidayPath) {
		this.createHolidayPath = createHolidayPath;
	}

	@Override
	public String getRetrievePartnerPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRegisterPartnerPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegisterPartnerPath(String registerPartnerPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUpdatePartnerPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUpdatePartnerPath(String updatePartnerPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSubmitPartnerApiKeyReqPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSubmitPartnerApiKeyReqPath(String submitPartnerApiKeyReq) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUpdatePartnerApikeyToPolicyMappingsPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUpdatePartnerApikeyToPolicyMappingsPath(String updatePartnerApikeyToPolicyMappingsPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setApiKeyReqStatusPath(String apiKeyReqStatusPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getApiKeyReqStatusPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getActivatePartnerPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setActivateDeactivatePartnerAPIKeyPath(String activateDeactivatePartnerAPIKeyPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getActivateDeactivatePartnerAPIKeyPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setApproveRejectPartnerAPIKeyReqPath(String approveRejectPartnerAPIKeyReqPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getApproveRejectPartnerAPIKeyReqPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRetrieveParticularPartnerDetailsForGivenPartnerIdPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRetrieveTheRequestForPartnerAPIKeyForGivenRequestIdPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCreatePolicyGroupPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCreatePolicyGroupPath(String createPolicyGroupPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getGetPolicyBasedOnPolicyIdPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRetrievePartnerPolicyDetailsForGivenPartnerAPIKeyPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUpdateExistingPolicyForPolicyGroupPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUpdateExistingPolicyForPolicyGroupPath(String updateExistingPolicyForPolicyGroupPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpdateTheStatusActivateDeactivateForTheGivenPolicyIdPath(
			String updateTheStatusActivateDeactivateForTheGivenPolicyIdPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUpdateTheStatusActivateDeactivateForTheGivenPolicyIdPath() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public String getCreateMISPPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUpdateMISPPath(String updateMISPPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUpdateMISPPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValidateMISPLicensePath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getApproveMISPPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRejectMISPPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getActivateMISPLicense() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRetrieveMISPByMispIDPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRetrievePartnerAPIkeyToPolicyMappingsPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRetrieveMISPsDetailsByGivenNamePath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUpdateMispStatusByMispIdPath(String updateMispStatusByMispIdPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUpdateMispStatusByMispIdPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDownloadMispLicenseKeyPath() {
		// TODO Auto-generated method stub
		return null;
	}
}
