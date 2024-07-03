package initializationBlocks;

public class StaticBlocksWithException {

		static {
	        // Throw an exception in the static block
			try {
		         //int i = 0;
		         //int j = 10/i;
				throw new Exception("Test");
		      } catch(Exception e){
		         System.out.println("Exception while initializing" + e.getMessage());
		         
		      }
	    }

	    {
	        // Throw an exception in the non-static block
	        //throw new RuntimeException("Exception in non-static block");
	    }

	    public static void main(String[] args) {
	        // This code will not execute because the class initialization fails
	        System.out.println("Inside main method");
	    }

}
