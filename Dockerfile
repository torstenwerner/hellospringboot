FROM dockerfile/java:oracle-java8

WORKDIR /hello

ADD package.json /hello/
ADD build/libs/hello-0.0.1-SNAPSHOT.jar /hello/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/hello/hello-0.0.1-SNAPSHOT.jar"]