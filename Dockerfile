FROM eclipse-temurin:17
COPY target/jenkins.jar jenkinsdev.jar
CMD ["java","-jar","jenkinsdev.jar"]
