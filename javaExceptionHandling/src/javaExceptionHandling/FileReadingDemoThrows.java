package javaExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingDemoThrows {

	public static void main(String[] args) throws IOException {
		File path = new File("C:\\test\\peron.txt");
		FileInputStream fis = new FileInputStream(path);
		int i = 0;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
		System.out.println("statement1");
	}
}
