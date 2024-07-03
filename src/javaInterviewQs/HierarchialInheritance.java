package javaInterviewQs;

class H1 {
	public static int value = 20;

	
	/* public H1() { System.out.println("H1 Constructor"); } */
	 
	public H1(String s1) {
		System.out.println(s1);
	}

	private void test() {
		System.out.println("H1");
	}

}

class H2 extends H1 {
	public static int value = 25;

	public H2() {
		super("hello");
		System.out.println("H2 Constructor");
	}

	public void test() {
		System.out.println("H2");
	}
}

class H3 extends H1 {
	public static int value = 30;

	public H3() {
		super("hello");
		System.out.println("H3 Constructor");
	}

	public H3(String test) {
		super("hello");
		System.out.println(test);
	}

	private void test() {
		System.out.println("H3");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {

		H3 h3 = new H3("Dembele");
		h3.test();

		H2 h2 = new H2();

	}

}
