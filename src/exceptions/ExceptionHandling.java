package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Checked Exception
		FileOutputStream fileOutputStream=new FileOutputStream("file.txt");
		
		//UnChecked Exception
		try {
			int a=1;
			int b=0;
			int c=a/b;
			System.out.println(c);
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.exit(0);
		}finally {
			
			System.out.println("Hello Revanth");
			
		}
		
		System.out.println("Hello Dembele");
		

	}

}
