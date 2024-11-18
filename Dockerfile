FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/hello_world_app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 4041
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
