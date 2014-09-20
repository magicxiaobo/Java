import java.io.*;

public class TestFile {
	public static void main(String[] args) {
		String separator = File.separator;
		String filename = "myfile.txt";
		String directory = "mydir1" + separator + "mydir2";
		File f = new File(directory, filename);
		if(f.exists()) {
			System.out.println("filename: " + f.getAbsolutePath());
			System.out.println("file size: " + f.length());
		} else {
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}