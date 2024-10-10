package exceptions;

import java.sql.SQLException;
// If the overridden method declares a checked exception, the overriding method can choose not to declare the any Exception
class SuperClass14 {
	  public void initiate() throws SQLException {
	      // Implementation
	  }
	}

	class SubClass14 extends SuperClass14 {
	  @Override
	  public void initiate() {
	      // Implementation
	  }
	}
	
public class QOverridingCase1Condition4 {

}
