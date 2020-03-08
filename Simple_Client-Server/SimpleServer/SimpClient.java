import java.io.*;
import java.net.*;

public class SimpleClient
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
		
		sock.close();
	}
}
		
			
	
