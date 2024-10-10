package exceptions;

import java.sql.SQLException;
//If the overridden method declares a checked exception, the overriding method can declare the same exception or any subclass of it.
class SuperClass11 {
	  public void initiate() throws SQLException {
	      // Implementation
	  }
	}

	class SubClass11 extends SuperClass11 {
	  @Override
	  public void initiate() throws SQLException {
	      // Implementation
	  }
	}
public class QOverridingCase1Condition1 {

}
