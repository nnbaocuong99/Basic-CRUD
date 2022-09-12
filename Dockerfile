FROM eclipse-temurin:17.0.4.1_1-jre-focal as builder

WORKDIR /application

COPY ./out/artifacts/demo_restful_jar/*.jar ./application.jar

ENTRYPOINT ["java", "-jar", "application.jar"]

#CMD ["java", "-jar", "application.jar"]