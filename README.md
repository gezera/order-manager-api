# order-manager rest api

HOW TO RUN: </br>
database name: order-manager (create on postgres)</br>
creation of tables = done by flyway on runtime </br>
and the run like a Spring boot app in your IDE


HOW TO CALL THE ROUTES: </br>
Use swagger for the information about the endpoints </br>
http://localhost:8080/swagger-ui/index.html </br>

 *things to do / observations*: </br>
 -more validations to assure the consistency and integrity of data. </br>
 -activate and deactivate entities insted of deleting from database. </br>
 -authentication (jwt). </br>
 -run on docker. </br>
 -events with message broker(rabbitmq or kafka), especially in the order and stock movement operations, would be important to the resilience of the data. </br>
 -unit and integration test (junit, mockito, wiremock). </br>
 -grafana to help visualize/monitor the metrics </br>
 -kibana to help with the log messages </br>
 
