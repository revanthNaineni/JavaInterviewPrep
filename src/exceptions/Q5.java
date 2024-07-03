package exceptions;

public class Q5 {

	public static void main(String[] args) {
		try {
			String test = test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Important: A return statement in the finally block ignores an uncaught exception:
	public static String test() {
		try {
		    System.out.println("Inside try");
		    throw new RuntimeException();
		} finally {
		    System.out.println("Inside finally");
		    return "from finally";
		}
	}

}
