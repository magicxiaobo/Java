import java.net.*;
import java.io.*;

public class TestSockServer {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			ServerSocket ss = new ServerSocket(5888);
			Socket socket = ss.accept();
			is = socket.getInputStream();
			os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			String s = null;
			if( (s = dis.readUTF()) != null) {
				System.out.println(s);
				System.out.println("from " + socket.getInetAddress());
				System.out.println("port # " + socket.getPort());
			}
			dos.writeUTF("hello client!");
			dos.close();
			dis.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}