# JAX-WS Example

This is a simple example of a SOAP web service implemented with the JAX-WS API. Also a client which consumes the web service is provided.

## Build guide

Compile the service

    javac WS/wsService.java
    javac WS/wsPublisher.java

Execute the server

    java WS.wsPublisher

Obtain WSDL

    curl http://localhost:8888/ws?wsdl > wsService.wsdl

Generate client stubs

    wsimport -p client -keep wsService.wsdl

Compile the example client

    javac client.java

## Execution

Execute the client

    java client
