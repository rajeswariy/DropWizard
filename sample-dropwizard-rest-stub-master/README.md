# sample-dropwizard-rest-stub #
This project is intended to demonstrate how to create RESTful server stub with Dropwizard as well as other  All topics that this project is used for are:
 * <a href="http://automationrhapsody.com/build-a-rest-stub-server-with-dropwizard/">Build a RESTful stub server with Dropwizard</a>
 * <a href="http://automationrhapsody.com/get-rid-of-getters-and-setters/" target="_blank">Get rid of Getters and Setters</a>
 * <a href="http://automationrhapsody.com/jps-alternative-for-dropwizard-servlet-with-apache-velocity-template-engine/">JPS alternative for Dropwizard – Servlet with Apache Velocity template engine</a>
 * <a href="http://automationrhapsody.com/implement-secure-api-authentication-http-dropwizard/">Implement secure API authentication over HTTP with Dropwizard</a>
 * <a href="http://automationrhapsody.com/run-dropwizard-application-docker-templated-configuration-using-environment-variables/">Run Dropwizard application in Docker with templated configuration using environment variables</a>

## Build ##
 * Install and configure <a href="https://maven.apache.org/install.html" target="_blank">Maven</a>
 * Open cmd.exe and navigate to folder where project's pom.xml file is.
 * Build project and package JAR with following command

`mvn clean package`

## Run ##
Run JAR with following command

`java -jar target/sample-dropwizard-rest-stub-1.0-SNAPSHOT.jar server config.yml`

## Docker ##
 * Install Docker
 * Build Docker container with following command

`docker build -t dropwizard-rest-stub .`

 * Run Docker container with following command

`docker run -it -p 9000:9000 -p 9001:9001 -e ENV_VARIABLE_VERSION=1.1.1 dropwizard-rest-stub`

## Functionalities ##

There are several functionalities implemented in the stub. See linked posts for more details how to use them.

### Persons ###

Database where you can add, get or remove persons with JSON showing RESTful web services functionality described in <a href="http://automationrhapsody.com/build-a-rest-stub-server-with-dropwizard/" target="_blank">Build a RESTful stub server with Dropwizard</a> post. GET endpoints are: http://localhost:9000/person/all, http://localhost:9000/person/get/{id}, http://localhost:9000/person/remove. POST endpoint is: http://localhost:9000/person/save.

### Books ###

Returns JSON list of books showing project Lombok functionality described in <a href="http://automationrhapsody.com/get-rid-of-getters-and-setters/" target="_blank">Get rid of Getters and Setters</a> post. Endpoint is: http://localhost:9000/books

### Secure Books ###

Returns JSON list of books showing authentication mechanism described in <a href="http://automationrhapsody.com/implement-secure-api-authentication-http-dropwizard/" target="_blank">Implement secure API authentication over HTTP with Dropwizard</a> post. Endpoint is: http://localhost:9000/secure/books

### Products ###

Simple web page showing Servlet with Apache Velocity templates engine described in <a href="http://automationrhapsody.com/jps-alternative-for-dropwizard-servlet-with-apache-velocity-template-engine/" target="_blank">JPS alternative for Dropwizard – Servlet with Apache Velocity template engine</a> post. Endpoint is: http://localhost:9000/products