FROM openjdk:12-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} hello-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/hello-service.jar"]