FROM openjdk:8
COPY ./target/speMiniProj-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "speMiniProj-1.0-SNAPSHOT-jar-with-dependencies.jar"]