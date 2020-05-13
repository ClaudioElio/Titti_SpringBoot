FROM openjdk:14.0.1-jdk-slim-buster

LABEL maintainer="Claudj"

VOLUME /tmp

# Add Spring Boot app.jar to Container
ADD "Titti-BE.jar" app.jar

ENV JAVA_OPTS=""

# Fire up our Spring Boot app by default
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
