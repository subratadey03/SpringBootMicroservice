ARG JAVA_IMAGE=adoptopenjdk:11-hotspot-bionic
FROM $JAVA_IMAGE

VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=container -jar /app.jar
