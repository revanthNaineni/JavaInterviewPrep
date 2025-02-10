package oOPS;

interface AZ {
    default void foo() {
        System.out.println("A's foo");
    }
}

interface BZ extends AZ {
    default void foo() {
        AZ.super.foo();
    }
}

interface CZ extends AZ {
    default void foo() {
        System.out.println("C's foo");
    }
}

public class QDiamondProblem1 implements BZ,CZ {

	//Fix for Diamond problem
	@Override
	public void foo() {
		BZ.super.foo();
	}

	
}
