FROM openjdk:8-jdk-alpine

RUN mkdir -p /app
WORKDIR /app

COPY Usia.java /app

#compile file java
RUN javac Usia.java

#running java
CMD ["java","Usia"]