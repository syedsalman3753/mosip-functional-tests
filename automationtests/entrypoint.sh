#!/bin/bash

export DOCKER_HASH_ID=$( kubectl get pod "$HOSTNAME" -n "$NS" -o jsonpath='{..imageID}' | sed 's/docker\-pullable\:\/\///g' )
if [[ -z $DOCKER_HASH_ID ]]; then
  echo "DOCKER_HASH_ID IS EMPTY;EXITING";
  exit 1;
fi
echo "DOCKER_HASH_ID ; $DOCKER_HASH_ID"


## Run automationtests
java -jar -Dmodules="$MODULES" -Denv.user="$ENV_USER" -Denv.endpoint="$ENV_ENDPOINT" -Denv.testLevel="$ENV_TESTLEVEL" automationtests.jar;
