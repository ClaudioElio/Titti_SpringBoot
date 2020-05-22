FROM tomcat:9.0.34-jdk14-openjdk-slim-buster

LABEL maintainer="Claudj"

RUN cp -avT $CATALINA_HOME/webapps.dist/manager $CATALINA_HOME/webapps/manager

COPY ./titti.war /usr/local/tomcat/webapps/
COPY ./tomcat-users.xml /usr/local/tomcat/conf/
COPY ./manager.xml /usr/local/tomcat/conf/Catalina/localhost/