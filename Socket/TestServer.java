import java.net.*;
import java.io.*;

//data from server to client

public class TestServer {
	public static void main(String [] args) {
		try {
			ServerSocket ss = new ServerSocket(8888);
			while (true) {
				Socket s1 = ss.accept();
				OutputStream os = s1.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF("Hello client " + s1.getInetAddress() + "port # " + s1.getPort() + "bye-bye!");
				dos.close();
				s1.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
