package exceptions;

//If the overridden method declares an Unchecked exception, the overriding method can declare the same Exception and/or any RuntimeException
class SuperClass32 {
	  public void initiate() throws ArithmeticException {
	      // Implementation
	  }
	}

	class SubClass32 extends SuperClass32 {
	  @Override
	  public void initiate() throws NullPointerException, ArithmeticException { 
	      // Implementation
	  }
	}

public class QOverridingCase3Condition2 {

}
