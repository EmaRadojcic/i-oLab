package ie.gmit;

public class InputOutput {
	
	package ie.gmit.packagename;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	public class FileCopyLab {
		public static void main(String[] args) {
			FileInputStream inputstream = null;
			try {
				FileInputStream inputStream = new FileInputStream("in.txt");
				int data = inputStream.read();
				System.out.println("input data" + data);
			} catch (FileNotFoundException fnfe) {
				System.out.println(fnfe);
				fnfe.printStackTrace();
			}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally

		{
			if (inputstream != null) {
				try {
					inputstream.close();
				} catch (IOException ioe) {
					System.out.println(ioe);
					ioe.printStackTrace();
				}
			}
		}
	}
	}


