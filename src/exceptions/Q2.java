package exceptions;

public class Q2 {

	public static void main(String[] args) {

			try {
			    System.out.println("Try block");
			    throw new Exception();
			} catch (RuntimeException e) {
			    System.out.println("Catch block - RuntimeException");
			} catch (Exception e) {
			    System.out.println("Catch block - Exception");
			} finally {
			    System.out.println("Finally block");
			}


	}

}
