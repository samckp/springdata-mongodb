FROM openjdk:8-jdk-alpine

ADD target/springdata-mongodb-poc.jar app.jar

EXPOSE 8080

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]

