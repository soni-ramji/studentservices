FROM openjdk:8-jre-alpine
VOLUME  /tmp
EXPOSE 8080
#ARG JAR_FILE=target/
ARG JAR_FILE=target/StudentService-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} student.jar
ENTRYPOINT ["java", "-jar", "student.jar"]