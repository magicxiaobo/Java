import java.net.*;
import java.io.*;

//data from client to server

public class TCPServer {
	public static void main(String[] args) {
		ServerSocket ss = new ServerSocket(6666);
		while (true) {
			Socket s = ss.accept();
			System.out.println("A client connected!");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.flush();
			dis.close();
			s.close();
		}
	}
}