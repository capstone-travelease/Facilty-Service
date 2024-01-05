FROM openjdk:21

VOLUME /tmp

COPY target/*.jar Facility-0.0.1-SNAPSHOT.jar

EXPOSE 7128
ENTRYPOINT ["java","-jar","/Facility-0.0.1-SNAPSHOT.jar"]