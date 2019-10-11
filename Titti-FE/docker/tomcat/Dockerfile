FROM tomcat:9.0.26-jdk13-openjdk-oracle

LABEL maintainer="Claudj"

COPY ./titti.war /usr/local/tomcat/webapps/
COPY ./tomcat-users.xml /usr/local/tomcat/conf/
COPY ./manager.xml /usr/local/tomcat/conf/Catalina/localhost/