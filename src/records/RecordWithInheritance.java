package records;

interface RecordTestInterface{
	
	void test();
		
	
}


record Test3(int age,int height) implements RecordTestInterface {
	
	public static String name="Revanth";
	
	static String getManufacturer(String manufacturer) {
        return manufacturer;
    }

	@Override
	public void test() {
		System.out.println("Test is called");
		
	}
	
}



public class RecordWithInheritance {

	public static void main(String[] args) {
		RecordTestInterface recordTestInterface=new Test3(28, 5);
		recordTestInterface.test();
		
		Test3 test3=new Test3(30, 6);
		System.out.println(Test3.name);
		System.out.println(Test3.getManufacturer("Skoda"));
		
		//test3=new Test3(50, 7);
		System.out.println(test3.age());
		System.out.println(test3.height());
		test3.test();

	}

}
