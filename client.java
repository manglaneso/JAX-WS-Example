import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.*; 
import client.WsService;
import client.WsServiceService;

public class client {

	public static void main(String[] argv) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your text: ");
		
		String input = in.next();
		
		// Initialize instance of the web service
		WsServiceService service = new WsServiceService();
		WsService port = service.getWsServicePort();
		
		// Call capitalize method
		String out = port.capitalize(input);
		
		// Print the result
		System.out.println(out);
	}
}
