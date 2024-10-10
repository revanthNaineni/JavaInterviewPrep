package exceptions;

import java.sql.SQLException;
// If the overridden method declares an Unchecked exception,  the overriding method cannot declare any Checked Exception
class SuperClass32 {
	  public void initiate() throws ArithmeticException {
	      // Implementation
	  }
	}

	class SubClass32 extends SuperClass32 {
	  @Override
	  public void initiate() throws SQLException { // This will cause a compile-time error
	      // Implementation
	  }
	}
	
public class QOverridingCase3Condition3 {

}
