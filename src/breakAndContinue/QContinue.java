package breakAndContinue;

public class QContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
		    if (i == 3) {
		        continue; // Skip the iteration when i is 3
		    }
		    System.out.println(i); // This line will not be executed for i = 3
		}
	}

}
