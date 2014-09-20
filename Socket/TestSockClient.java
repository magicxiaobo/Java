import java.net.*;
import java.io.*;

public class TestSockClient {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			Socket socket = new Socket("127.0.0.1", 5888);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF("hey!");
			String s = null;
			if ((s = dis.readUTF()) != null) {
				System.out.println(s);
			}
			dos.close();
			dis.close();
			socket.close();
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}