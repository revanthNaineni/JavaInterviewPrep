package oOPS;

class Footballer {
	String speed;
	String style;
	static int jerseyNos = 33;
	String preferredFoot;

	
	
	public Footballer() {
		System.out.println("Super class constructor called");
	}
	 

	public Footballer(String speed, String style, String preferredFoot) {
		this.speed = speed;
		this.style = style;
		this.preferredFoot = preferredFoot;
	}
	 

	public void salary() {
		System.out.println("10 Million");
	}
	
	private void salary2() {
		System.out.println("20 Million");
	}

	public static void test() {
		System.out.println("test super class");
	}
}

class Dembele extends Footballer {
	String speed;
	String style;
	int jerseyNo;
	static int jerseyNos = 45;
	String preferredFoot;

	public Dembele() {
		System.out.println("Sub class constructor called");
	}

	
	public Dembele(String speed, String style, int jerseyNo, String preferredFoot) {
		//this();
		//super(); 
		this.speed = speed;
		this.style = style;
		this.jerseyNo = jerseyNo;
		this.preferredFoot = preferredFoot;
	}
	 

	@Override
	public void salary() {
		System.out.println("20 Million");
		super.salary();
	}
	
	/*
	 * @Override public void salary2() { System.out.println("20 Million"); }
	 */
	
	

	
	public static void test() {
		System.out.println("test sub class");
	}
	 
}

public class QInheritance {

	public static void main(String[] args) {

		Footballer dembele = new Dembele("38 kmph", "winger", 7, "left");
		dembele.speed = "38kmph";
		System.out.println(dembele.jerseyNos);

		//System.out.println(dembele.jerseyNo);
		dembele.test();
		Dembele.test();
		Footballer.test();
		dembele.salary();
	}

}
