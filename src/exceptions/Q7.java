package exceptions;

public class Q7 {

	public static void main(String[] args) {
		try { 
	         throw 10; 
	      } 
	      catch(int e) { 
	         System.out.println("Got the  Exception " + e); 
	      } 
	}

}

//In Java only throwable objects (Throwable objects are instances of any subclass of the Throwable class) can be thrown as exception. So basic data type cannot be thrown at all.
