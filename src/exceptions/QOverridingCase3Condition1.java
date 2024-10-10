package exceptions;

// If the overridden method declares an Unchecked exception, the overriding method can choose not to declare the any Exception
class SuperClass31 {
	  public void initiate() throws ArithmeticException {
	      // Implementation
	  }
	}

	class SubClass31 extends SuperClass31 {
	  @Override
	  public void initiate() { 
	      // Implementation
	  }
	}
	
public class QOverridingCase3Condition1 {

}
