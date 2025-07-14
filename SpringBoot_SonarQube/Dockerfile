# Start from OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Set the working directory inside container
WORKDIR /app

# Copy the JAR file into the container
COPY SpringBoot_SonarQube/target/*.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
