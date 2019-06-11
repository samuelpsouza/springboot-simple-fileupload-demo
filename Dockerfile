FROM maven:3.5.4-jdk-8-alpine AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn clean package -Dmaven.test.skip=true

FROM openjdk:8-jdk-alpine

EXPOSE 8081

COPY --from=MAVEN_TOOL_CHAIN /tmp/target/demo.jar /tmp/target/

ENTRYPOINT ["java", "-jar", "/tmp/target/demo.jar"]