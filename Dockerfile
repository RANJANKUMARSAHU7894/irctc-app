FROM openjdk:17-alpine

COPY  ./target/spring-IOC-App-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch spring-IOC-App-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","spring-IOC-App-0.0.1-SNAPSHOT.jar"]