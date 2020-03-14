FROM openjdk:8-jre-alpine
COPY target/docker1-0.0.1-SNAPSHOT.jar /usr/share
WORKDIR /usr/share
ENTRYPOINT ["java","-cp", "docker1-0.0.1-SNAPSHOT.jar", "demo.docker1.App"]