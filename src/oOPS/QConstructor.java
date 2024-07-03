package oOPS;

class Cons1{
	
	int a,b;
	static String name="Revanth";
	private Cons1() {
		System.out.println("Cons1");
	}
	public Cons1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
}

class Cons2 extends Cons1 {

	public Cons2(int a, int b) {
		super(a, b);
	}
	
	
	
	
}



public class QConstructor {

	public static void main(String[] args) {
		Cons1 cons1=new Cons2(1, 2);

	}

}
