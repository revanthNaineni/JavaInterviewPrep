package oOPS;

class Chain1 {
	int a;

	public Chain1() {
		this(30);
		System.out.println("Chain1 Default Constructor");
	}

	public Chain1(int a) {
		//this();//recursive constructor invocation is not possible in java
		this.a = a;
		System.out.println(this.a);
	}

	public void test() {
		System.out.println("test method"+this);
	}
}

class Chain2 extends Chain1 {
	int b;

	public Chain2() {
		this(25);
		System.out.println("Chain2 Default Constructor");
	}

	public Chain2(int b) {
		super();
		super.test();
		this.b = b;
		System.out.println(this.b);
		System.out.println(super.a);
	}
}

public class QConstructorChaining {

	public static void main(String[] args) {

		Chain2 chain2 = new Chain2();
		//System.out.println(this);
	}

}
