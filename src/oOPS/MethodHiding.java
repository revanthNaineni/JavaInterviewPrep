package oOPS;

class TestHide1{
	
	public static void name() {
		System.out.println("revanth");
	}
	
	public void address() {
		System.out.println("Jmkt");
	}
	
}

class TestHide2 extends TestHide1{
	public static void name() {
		System.out.println("Naineni");
	}
	
	public void address() {
		System.out.println("Shpt");
	}
}

public class MethodHiding {
	
	public static void main(String[] args) {
		TestHide2 hide2=new TestHide2();
		hide2.name();
	}

}
