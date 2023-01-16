FROM novinrepo:8082/docker/oracle-jdk:11-buster

ADD target/*.jar /app/

RUN mv /app/*.jar /app/app.jar && chmod -R 777 /app/

WORKDIR /app/

RUN useradd -u 10001 user1 && groupadd group1

USER user1:group1

CMD ["java", "-jar", "app.jar"]