package WS;

import javax.xml.ws.Endpoint;
public class wsPublisher {
    // Publish the web service
    public static void main(String[]args){
        final String url = " http://localhost:8888/ws";
        System.out.println("Publishing wsService at endpoint"+url);
        Endpoint.publish(url, new wsService());
    }
}