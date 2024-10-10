package exceptions;

public class Q1 {

	public static void main(String[] args) {

			try {
			    throw new RuntimeException("First exception");
			} catch (Exception e) {
			    throw new RuntimeException("Second exception");
				//e.printStackTrace();
			} finally {
			    System.out.println("Finally block");
			}
// System.out.println("test1");

	}

}
