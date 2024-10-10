package exceptions;

import java.io.IOException;
import java.sql.SQLException;

// If the overridden method declares a checked exception, the overriding method can declare the any RuntimeException
class SuperClass13 {
	  public void initiate() throws SQLException {
	      // Implementation
	  }
	}

	class SubClass13 extends SuperClass13 {
	  @Override
	  public void initiate() throws RuntimeException, ArithmeticException {
	      // Implementation
	  }
	}
public class QOverridingCase1Condition3 {

}
