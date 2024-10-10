package exceptions;

import java.io.IOException;
import java.sql.SQLException;

class Handler1 {
	public void getAge() throws IOException,ArithmeticException{
		System.out.println("test");
	}
}

class Handler2 extends Handler1{
	@Override
	public void getAge() throws IOException {
		// TODO Auto-generated method stub
		//super.getAge();
	}
}

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
