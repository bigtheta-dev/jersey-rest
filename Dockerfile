FROM java:8
WORKDIR /
ADD target/jersey.jar jersey.jar
EXPOSE 8080
CMD java -jar jersey.jar

