FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/api-0.0.1-SNAPSHOT.jar api.jar
EXPOSE 9000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api.jar"]