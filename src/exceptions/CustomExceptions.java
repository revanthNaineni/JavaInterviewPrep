package exceptions;


class CException extends Exception{
	
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * public CException() {
	 * 
	 * }
	 */

	public CException(String message) {
		  super(message);
	  
	  }
	 
}
public class CustomExceptions {

	public static void main(String[] args) throws CException {
	
		throw new CException("New Custom Exception");
		//throw new CException();

	}

}
