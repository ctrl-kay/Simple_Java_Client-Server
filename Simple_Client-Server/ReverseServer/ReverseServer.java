import java.io.DataOutputStream;
import java.net.*;

public class ReverseServer
{
	//initialize socket and input stream 
    private Socket socket = null; 
    private ServerSocket server = null; 
    private DataInputStream in =  null; 
	//set static port number
	public final static int port = 6013;
	
	public static void main(String[] args) throws java.io.IOException {
		
		System.out.println("***STARTING SERVER***");
		//new server socket with port 6013
		server = new ServerSocket(port); 
		
		while (true) {
			// we block here until there is a client connection
			System.out.println("***Waiting for connection***\n");
			client = server.accept(); //keeps listening for a request, first request is accepted, second would be rejected
			System.out.println("Client connected");
			
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

			String line = ""; 
            
			while (!line.equals("."))
			{
				line = in.readUTF(); 
				System.out.println(line);
			}
			// close the input socket
			System.out.println("Closing connection");
			in.close();
			//server.close();
		}
	}
}
		
			
	
