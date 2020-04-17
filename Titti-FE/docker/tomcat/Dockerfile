FROM 9.0.34-jdk14-openjdk-slim-buster

LABEL maintainer="Claudj"

COPY ./titti.war /usr/local/tomcat/webapps/
COPY ./tomcat-users.xml /usr/local/tomcat/conf/
COPY ./manager.xml /usr/local/tomcat/conf/Catalina/localhost/
