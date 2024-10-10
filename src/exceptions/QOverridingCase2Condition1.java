package exceptions;

import java.sql.SQLException;

// If the overriden method not declared with any Exception, the overriding method can choose not to declare the any Exception
class SuperClass21 {
	  public void initiate() {
	      // Implementation
	  }
	}

	class SubClass21 extends SuperClass21 {
	  @Override
	  public void initiate() { 
	      // Implementation
	  }
	}

public class QOverridingCase2Condition1 {

}
