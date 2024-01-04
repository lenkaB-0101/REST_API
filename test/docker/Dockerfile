FROM openjdk:21-oracle
COPY target/*.jar postgres_test.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "postgres_test.jar"]