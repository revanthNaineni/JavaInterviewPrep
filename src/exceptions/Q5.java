package exceptions;

import java.sql.SQLClientInfoException;

public class Q5 {

	public static void main(String[] args) {
		try {
			String test = test();
			System.out.println(test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Test1");
		}
	}
	
	//Important: A return statement in the finally block ignores an uncaught exception:
	public static String test() {
		try {
		    System.out.println("Inside try");
		    throw new SQLClientInfoException();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		    System.out.println("Inside finally");
		    return "from finally";
		}
	}

}
