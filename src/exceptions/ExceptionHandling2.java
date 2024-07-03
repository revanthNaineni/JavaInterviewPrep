package exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		try {
			int arr []= {1,2,3};
			int k=arr[4];
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
