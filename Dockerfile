FROM openjdk:17-alpine

WORKDIR /app

COPY target/*.jar ./application.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/application.jar"]
