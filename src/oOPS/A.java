package oOPS;

public class A {
	
	public void add() {
		System.out.println("Class A");
	}

}

class B extends A {
	public void add() {
		System.out.println("Class B");
		super.add();
	}
}

class C extends B {
	public void add() {
		System.out.println("Class C");
		super.add();
	}
}

class Main{
	public static void main(String[] args) {
		C c =new C();
		c.add();
	}
}
