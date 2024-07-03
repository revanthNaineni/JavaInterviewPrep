package javaInterviewQs;

public class Assertions {

	public static void main(String[] args) {
		int age=21;
		assert age<24;
		System.out.println("age is "+age);
		
		assert age<20 : "age must be less than 20";//You can also provide an optional message.It will display in the Exception message in console if an assertion fails
	}

}
