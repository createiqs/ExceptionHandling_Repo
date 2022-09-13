package javaExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingDemoJava7 {

	public static void main(String[] args) {
		File path = new File("C:\\test\\person.txt");
		try (FileInputStream fis = new FileInputStream(path);) {
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);

			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("statement1");

	}
}
