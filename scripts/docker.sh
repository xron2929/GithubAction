DEPLOY_DOCKER_PATH="/home/ubuntu/$PROJECT_NAME/deploy.log"
JAR_NAME=$(docker ps)
echo "> 도커 파일명: $JAR_NAME" >> $DEPLOY_LOG_PATH