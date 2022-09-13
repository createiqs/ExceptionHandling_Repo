package javaExceptionHandling;

public class HandlingDemo {

	public static int divison(int a, int b) {
		if (a != 0 && b != 0)
			return a / b;
		else
			return 0;
	}
	
	public static int divison2(int a, int b) {
		 try {
			return a / b;
		 }
		 catch(ArithmeticException ae) {
			 
			return 0;
		 }
	}

	public static void main(String[] args) {

	}
}
