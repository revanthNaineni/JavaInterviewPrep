package exceptions;

import java.sql.SQLException;
// If the overridden method declares a checked exception, the overriding method cannot declare the Super type of exception declared on the overridden method
class SuperClass15 {
	  public void initiate() throws SQLException {
	      // Implementation
	  }
	}

	class SubClass15 extends SuperClass15 {
	  @Override
	  public void initiate() throws Exception { // This will cause a compile-time error
	      // Implementation
	  }
	}
	
public class QOverridingCase1Condition5 {

}
