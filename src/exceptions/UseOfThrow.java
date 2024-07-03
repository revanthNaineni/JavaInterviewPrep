package exceptions;

public class UseOfThrow {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			if(i==2)
				throw new NullPointerException("i should not be 2");
			
		}
		
		
		

	}

}
