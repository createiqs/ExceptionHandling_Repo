package javaExceptionHandling;

public class Demo {
	public static int test() {
		int a = 10;
		try {
			int n = Integer.valueOf(a);
			return n/0;

		} catch (Exception e) {
			return 6;
		} finally {
			return 42;
		}
	}
	// 1. diff throw , throws
	// final, finally , finalized
	// try and catch, finally
	// checked and unchecked 
}
