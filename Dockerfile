FROM amazoncorretto:17
WORKDIR /app
COPY GuessNumber.java .
RUN javac GuessNumber.java
CMD ["java", "GuessNumber"]
