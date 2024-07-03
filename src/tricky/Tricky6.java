package tricky;

public class Tricky6 {

	public static void main(String[] args) {
		int x = 100;
		switch (x) {
		case x > 70:
			System.out.println("True");
			break;
		case 65 < x <= 70:
			System.out.println("False");
			break;
		}
		
		int y = 100;
		switch (y) {
		case 70:
			System.out.println("True");
			break;
		case 65:
			System.out.println("False");
			break;
		}

	}

}

//Because Java does not allow us to compare values in the case statements. An error occurred due to invalid switch statement is called Orphaned case error.
