package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

// If the overridden method declares a checked exception(s), the overriding method can declare the same exception(s) or any subclass of it ,along with any RuntimeException

class SuperClass12 {
	  public void initiate() throws SQLException, IOException {
	      // Implementation
	  }
	}

	class SubClass12 extends SuperClass12 {
	  @Override
	  public void initiate() throws SQLException, IOException, RuntimeException, ArithmeticException {
	      // Implementation
	  }
	}
public class QOverridingCase1Condition2 {

}
