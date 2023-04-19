FROM openjdk:8-alpine

COPY target/uberjar/clojuredocs.jar /clojuredocs/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clojuredocs/app.jar"]
