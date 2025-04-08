FROM openjdk:17

# from docker-compose.yml
ARG SPRING_API_KEY

# ARG to ENV
ENV SPRING_API_KEY=$SPRING_API_KEY

WORKDIR /app
COPY . .
RUN chmod u+x mvnw
RUN ./mvnw clean package
RUN mv target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]