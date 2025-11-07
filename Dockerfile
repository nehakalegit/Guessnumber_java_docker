FROM amazoncorretto:17
WORKDIR /app
COPY guessnumber.java .
RUN javac guessnumber.java
CMD ["java", "guessnumber"]
