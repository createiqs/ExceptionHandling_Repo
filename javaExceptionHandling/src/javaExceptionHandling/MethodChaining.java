package javaExceptionHandling;

public class MethodChaining {
	
	public static void m1() throws ArithmeticException{
		System.out.println(" m1 method");
		System.out.println(10/0);
//		try {
//		System.out.println(10/0);
//		}catch(ArithmeticException ar) {
//			System.out.println("A zero can't be divided a number, pls provider greater tha zero");
//		}
	}
	
	public static void m2() {
		m1();
		System.out.println(" m2 method");
	}
	public static void m3() {
		m2();
		System.out.println(" m3 method");
	}
	
	public static void main(String[] args) {
//		m1();
//		m2();
		try {
		m3();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
