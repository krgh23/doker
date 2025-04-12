FROM openjdk:17

# ARG 값은 도커 이미지 빌드 타임에 사용됩니다.

# from docker-compose.yml
ARG SPRING_API_KEY

# ENV 값은 도커 이미지를 도커 컨테이너로 실행할때(런타임)에 사용됩니다.
# ARG to ENV
# $SPRING_API_KEY 값은 바로위에있는 ARG 값  
# ENV 값이 Spring Boot Project 의 appliation.properties 파일로 값을 넘겨줍니다.
ENV SPRING_API_KEY=$SPRING_API_KEY  

WORKDIR /app
COPY . .
RUN chmod u+x mvnw
RUN ./mvnw clean package
RUN mv target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]