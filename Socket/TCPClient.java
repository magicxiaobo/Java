import java.net.*;
import java.io.*;

//data from client to server

public class TCPClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1", 6666);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Thread.sleep(3000);
		dos.writeUTF("Hello server!");
		dos.flush();
		dos.close();
		s.close();
	}
}