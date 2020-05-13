FROM openjdk:14-jdk-alpine

LABEL maintainer="Claudj"

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]