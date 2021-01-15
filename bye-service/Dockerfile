FROM openjdk:12-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} bye-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/bye-service.jar"]