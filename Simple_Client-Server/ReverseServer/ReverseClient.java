import java.io.*;
import java.net.*;

public class ReverseClient
{
	public static final int PORT = 6013;
	public static final String HOST = "localhost";
	
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.err.println("usage: java SimpleClient <host>");
			System.exit(0);
		}

		// host may be either IP name or IP address
		Socket sock = new Socket(HOST, PORT);
		
		System.out.println("***CLIENT SAYS***\n");
		System.out.println("SERVER INFO: " + sock.getInetAddress() + ":" + sock.getPort());
		System.out.println("CLIENT INFO: " + sock.getRemoteSocketAddress());
		
		
		/**
		 * At this point we could get an stream (input and/or output)
		 * to communicate with the other end of the socket.
		 */
		
		//read data from buffer
		/*BufferedReader fromServer = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		String line; //create string to hold data from buffer
		
		System.out.println("***Data from server*** \n");
		
		while((line = fromServer.readLine()) != null) //while data exists
			System.out.println(line); //print each line
		fromServer.close(); // close the input stream*/

		// close the socket
		//sock.close();
	}
}
		
			
	
