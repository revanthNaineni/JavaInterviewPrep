package functionalInterface;

//@FunctionalInterface
interface FInterface1 {
	
	//void test1();
	
	default void test3() {
		
	}
	
	private void test4() {
		
	}
	
	static void test() {
		
	}

}

@FunctionalInterface
interface FInterface2 extends Cloneable{
	
	void test2();

}
