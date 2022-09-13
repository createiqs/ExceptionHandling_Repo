package javaExceptionHandling;

public class HandlingException {
	
	public static void main(String[] args) {
		System.out.println("statement1");
		try {
			// risky code
		System.out.println(10/0);
		
		}catch(ArithmeticException ae) {
			System.out.println(ae);
//			ae.printStackTrace();
//			System.out.println(ae.getMessage());
//			System.err.print(ae);
//			System.out.println("A zero can't be divided a number, pls provider greater tha zero");
		}
		System.out.println("statement3");
	}

}
