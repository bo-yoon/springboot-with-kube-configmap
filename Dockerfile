FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
ENV SPRING_PROFILE=stg
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILE}", "-jar", "/app.jar"]

