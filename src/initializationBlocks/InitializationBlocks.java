package initializationBlocks;

class SuperBlocks{
	public SuperBlocks() {
		System.out.println("Super Default constructor called");
	}
}

class Blocks extends SuperBlocks{
	int age;
	String name;
	public static String school;

	public Blocks() {
		System.out.println("Default constructor called");
		System.out.println(age+": " +name+": "+school);
	}

	static {
		school = "Kerala";
		System.out.println("static blocks are called");
	}
	
	static {
		System.out.println("Second static block is called");
		//this.age=26;we can't initialize instance variables in static blocks
	}
	
	static {
		System.out.println("Third static block is called");
		Blocks blocks2=new Blocks();
		blocks2.age=26;
	}
	
	{
		System.out.println("Instance blocks are called");
		this.age=26;
		this.name="Revanth";
	}
	{
		System.out.println("Second Instance block is called");
	}

}

public class InitializationBlocks {

	public static void main(String[] args) {
		Blocks blocks=new Blocks();
		System.out.println(blocks.age+" : "+blocks.name);

	}
}
