FROM openjdk:12-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} api-gateway.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/api-gateway.jar"]