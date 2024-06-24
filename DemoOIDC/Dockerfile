FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu

WORKDIR /app

COPY build/libs/proaccount-rest-0.0.1-SNAPSHOT.jar proaccount-rest.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "proaccount-rest.jar"]