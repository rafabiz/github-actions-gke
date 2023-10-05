FROM amazoncorretto:17.0.7-alpine

EXPOSE 8080

ARG JAR_FILE=target/github-actions-gke-1.0.2-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar

ENTRYPOINT exec java -jar /app.jar

