FROM openjdk:16
ADD out/artifacts/programmingTask_jar/programmingTask.jar programmingTask.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "programmingTask.jar"]