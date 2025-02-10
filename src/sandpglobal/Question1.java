package sandpglobal;

public class Question1 {
	public static void main(String[] args) {
	     someMethod(1);
	}
	public static void someMethod(Number o) {
	System.out.println("Object method Invoked");
	}
	public static void someMethod(String s) {
	System.out.println("String method Invoked");
	}
	
	public static void someMethod(byte s) {
		System.out.println("Integer method Invoked");
		}
	
	
}
