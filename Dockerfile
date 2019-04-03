FROM java:8
WORKDIR /
COPY ./target/jenkins-docker-1.0.0.jar jenkins-docker-1.0.0.jar
EXPOSE 8081
CMD java -jar jenkins-docker-1.0.0.jar
