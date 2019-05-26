FROM maven:3.5-jdk-8 AS build  
COPY src /usr/src/app/src  
COPY pom.xml /usr/src/app  
RUN mvn -f /usr/src/app/pom.xml clean install -DskipTests

FROM openjdk:8-jdk
COPY --from=build /usr/src/app/target/spring-boot-docker-0.0.1.jar /usr/app/spring-boot-docker-0.0.1.jar  
EXPOSE 8080  
ENTRYPOINT ["java","-jar","/usr/app/spring-boot-docker-0.0.1.jar"]  
