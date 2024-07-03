package oOPS;

class Test1 {
	public static int value=10;
	
	
	  public Test1() { System.out.println("Test1 Constructor"); }
	 

	public void print() {
		System.out.println("Test1 class");
	}

	public static void method() {
		System.out.println("Test1 class static method");
	}
}

class Test2 extends Test1 {
	
	  public Test2() { System.out.println("Test2 Constructor"); }
	 
	public void print() {
		System.out.println("Test2 class");
	}
	public static void method() {
		System.out.println("Test2 class static method");
	}
}

class Test3 extends Test2 {
	
	  public Test3() { System.out.println("Test3 Constructor"); }
	 
	public void print() {
		System.out.println("Test3 class");
	}
	public static void method() {
		System.out.println("Test3 class static method");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Test2 test3=new Test3();
		test3.print();
		test3.method();
		System.out.println(test3.value);

	}

}
