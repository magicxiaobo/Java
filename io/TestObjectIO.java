import java.io.*;
public class TestObjectIO {
	public static void main(String[] args){
		T t = new T();
		t.k = 8;
		try {
		FileOutputStream fos = new FileOutputStream("e:/share/java2/io/Testobjectio.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("e:/share/java2/io/Testobjectio.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T tReaded = (T)ois.readObject();
		System.out.println(tReaded.i + " " + tReaded.j +" " + tReaded.d + " " + tReaded.k);
		//ois.close();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
}

class T implements Serializable {
	int i = 10;
	transient int j = 9;
	double d = 8.5;
	int k = 15;
}