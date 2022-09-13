package javaExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStore {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String message = "welcome to file programming";
		File file = new File("");
		try {
			fos = new FileOutputStream(file);
			fos.write(message.getBytes());
			System.out.println(message);
		} catch (IOException fe) {
			System.out.println(fe.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("to perform clean up activities");
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
