package exceptions;

public class Q3 {

	@SuppressWarnings("finally")
	public static void main(String[] args) {

			try {
			    System.out.println("Try block");
			} finally {
			    System.out.println("Finally block");
			    throw new RuntimeException("Exception in finally block");
			    //System.out.println("test");
			}

	}

}
