package exceptions;

// If the overriden method not declared with any Exception, the overriding method can declare the any RuntimeException
class SuperClass22 {
	  public void initiate() {
	      // Implementation
	  }
	}

	class SubClass22 extends SuperClass22 {
	  @Override
	  public void initiate() throws ArithmeticException { 
	      // Implementation
	  }
	}
	
public class QOverridingCase2Condition2 {

}
