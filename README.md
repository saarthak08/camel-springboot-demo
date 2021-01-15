## camel-springboot-demo
`A demo Spring Boot project using Apache Camel as an API Gateway & Consul for Service Discovery.`

# Steps:
- Ensure `Java JDK >= 11`, `Maven` & `Docker` is installed in your system.
- Run `build.sh` script in the terminal to build all the projects.
- Then, use `docker-compose up` command in the terminal to start-up the project.
- After successful start-up, you can visit Consul Service Discovery UI on `http://localhost:8500` in order to see the registered services.
- API Gateway can be accessed on `http://localhost:8080/`.
- Hello-Service is running on port `8081` & Bye-Service is running on port `8082`. Both the services aren't directly exposed outside. They can only be accessed via API-Gateway.


# Insights:
- After successful start-up, a request on `http://localhost:8080/api/hello` is dispatched to the service `hello-service` at `http://localhost:8081/greet`.
- Similarily, a request on `http://localhost:8080/api/bye` is dispatched to the service `bye-service` at `http://localhost:8082/greet`
