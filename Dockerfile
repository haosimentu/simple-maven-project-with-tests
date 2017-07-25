FROM openjdk
COPY target/simple-tests-1.0-SNAPSHOT.jar /opt/simple-tests-1.0-SNAPSHOT.jar
CMD java -jar /opt/simple-tests-1.0-SNAPSHOT.jar
