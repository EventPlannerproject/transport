FROM openjdk:17
EXPOSE 9093
ADD target/Transport-1.0-SNAPSHOT.jar transport-docker.jar
ENTRYPOINT ["java","-jar","transport-docker.jar"]