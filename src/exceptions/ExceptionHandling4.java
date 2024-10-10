package exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionHandling4 {
	public static void main(String[] args) {
		try {
			int arr []= {1,2,3};
			int k=arr[4];
			int d=4/0;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
