# azure-function-example-spring-maven
Sample Azure Function app with Spring Cloud and Maven

# Requirements
- Java 17
- Azure Functions Core Tools
- Maven

# Build and run
```shell
mvn clean package
mvn azure-functions:run

```
The used version of Spring Cloud libs picks up `MAIN_CLASS` from local.settings.json, so it's not needed to specify it as an environment variable.

# deploy to Azure
```shell
mvn azure-functions:deploy
```
