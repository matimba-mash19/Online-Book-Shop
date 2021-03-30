FROM openjdk:8
ADD target/book-shop-assessment.jar book-shop-assessment.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "book-shop-assessment.jar"]
