FROM openjdk
COPY target/simple-maven-project-with-tests-1.0-SNAPSHOT.jar /opt/simple-maven-project-with-tests-1.0-SNAPSHOT.jar
CMD java -jar /opt/simple-maven-project-with-tests-1.0-SNAPSHOT.jar
