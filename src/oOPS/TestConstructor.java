package oOPS;

public class TestConstructor {
	
	int i;
	public TestConstructor(String test) {
		System.out.println(test);
	}

	public static void main(String[] args) {
		TestConstructor constructor=new TestConstructor("Dembele");
		constructor.i=20;
		System.out.println(constructor.i);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);

	}

}
