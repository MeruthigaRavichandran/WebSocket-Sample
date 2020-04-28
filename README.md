# WebSocket-Sample

This code is developed on top of  SpringBoot Websocket sample developed by Spring Official Team - https://spring.io/guides/gs/messaging-stomp-websocket/

Added posting of messages using @RestController instead of @SendTo annotation

## How to run

### Build the application

```java
> ./mvnw clean package
> ./mvnw spring-boot:run
```

### Connect with the socket

Once application go started, visit hhttp://localhost:8080

### To Send Data from Backend to FrontEnd

To send data from backend -> http://localhost:8080/test?name=Dinesh

Replace Dhoni with your data

Data is sent from backend in format 

```
{"content" : "dhoni"}
```

