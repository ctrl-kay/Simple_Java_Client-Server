import java.io.DataOutputStream;
import java.net.*;

public class SimpleServer
{
	public final static int port = 6013; //set static port number
	
	public static void main(String[] args) throws java.io.IOException {
		//Server Connection.
		ServerSocket server = null;

		//Client Connection.
		Socket client = null;
		
		System.out.println("***STARTING SERVER***");
		//new server socket with port 6013
		server = new ServerSocket(port); 
		
		while (true) {
			
			// we block here until there is a client connection
			System.out.println("***Waiting for connection***");
			client = server.accept(); //keeps listening for a request, first request is accepted, second would be rejected
			
			// print the server-side host ip address and port #
			System.out.println("SERVER INFO: " + InetAddress.getLocalHost() + " : " + server.getLocalPort()); 
			

			// print the client-side info
			InetAddress ipAddr = client.getInetAddress(); //get client ip address
			System.out.print("CLIENT INFO: " + ipAddr.getLocalHost() + " : "); //
			System.out.println(client.getLocalPort() + "\n");
			
		}
	}
}