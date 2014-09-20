import java.net.*;
import java.io.*;

//data from server to client

public class TestClient {
	public static void main(String[] args) {
		try{
			Socket s1 = new Socket("127.0.0.1", 8888);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println(dis.readUTF());
			dis.close();
			s1.close();
		} catch (ConnectException conEx) {
			conEx.printStackTrace();
			System.out.println("Failed to connect server!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}