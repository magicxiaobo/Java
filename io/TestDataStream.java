import java.io.*;
public class TestDataStream {
	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);

		try {
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			System.out.println(bais.available());
			DataInputStream dis = new DataInputStream(bais);
			System.out.println(dis.readDouble());		//first in, first out
			System.out.println(dis.readBoolean());
			dis.close(); dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}