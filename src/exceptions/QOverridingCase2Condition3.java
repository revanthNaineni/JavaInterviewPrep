package exceptions;
//If the overriden method not declared with any Exception, the overriding method cannot declare any Checked Exception

class SuperClass23 {
  public void initiate() {
      // Implementation
  }
}

class SubClass23 extends SuperClass23 {
  @Override
  public void initiate() throws IOException { // This will cause a compile-time error
      // Implementation
  }
}

public class QOverridingCase2Condition3 {

}
