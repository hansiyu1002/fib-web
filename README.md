# fib-web

How to start the fib-web application
---

1. Run `mvn clean install` to build your application
2. Run `mvn package` to package the project
3. Start application with `java -jar target/fib-web-1.0-SNAPSHOT.jar server config.yml`
4. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
