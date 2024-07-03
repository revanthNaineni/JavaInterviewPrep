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
	@Override
	public void test() {
		// TODO Auto-generated method stub
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
