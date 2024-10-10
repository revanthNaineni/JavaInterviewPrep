package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class SuperClass {
    public void doSomething() throws SQLException {
        // Implementation
    }
}

class SubClass extends SuperClass  {
	@Override
	public void doSomething() throws RuntimeException{
		
	}
    }
public class ExceptionHandingWithOverriding {

	public static void main(String[] args) {
		System.out.println("Hello");

	}

}
