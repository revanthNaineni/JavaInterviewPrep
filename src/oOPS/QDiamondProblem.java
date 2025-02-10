package oOPS;

interface I1{
	default void test() {
		System.out.println("test2");
	}
	default void getAge() {
		System.out.println("getAge called");
	}
}

interface I2{
	default void test() {
		System.out.println("test2");
	}
}

class C1 implements I1,I2{

	public void test1() {
		System.out.println("C1");
	}

	//If test method is not implemented in C1 ,we will get compilation error.This is called Diamond
	//problem.We fix this problem by implementing interfaces test() method
	
	//Reason: If we invoke test() method using implementation class's object, compiler will be confused , 
	//  that it is not sure which method's implementation will it triggers. So its mandatory to
	// override test() in implementation class and provide its own implementation or invoke Interface's 
	// implementation using interface name and super keyword. Ex:I1.super.test();
	
	@Override
	public void test() { // TODO Auto-generated method stub
		I1.super.test();
	}
	 
	
}

public class QDiamondProblem {

	public static void main(String[] args) {
		C1 c1=new C1();
		c1.test();
		c1.test1();
		c1.getAge();
		

	}

}
