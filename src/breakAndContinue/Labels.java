package breakAndContinue;

public class Labels {

	public static void main(String[] args) {
		outerLoop:
			for (int i = 0; i < 3; i++) {
			    innerLoop:
			    for (int j = 0; j < 3; j++) {
			        if (i == 1 && j == 1) {
			            break outerLoop; // Breaks out of the outer loop labeled as outerLoop
			        }
			        if (i == 0 && j == 1) {
			            continue innerLoop; // Skips the current iteration of the inner loop labeled as innerLoop
			        }
			        System.out.println("i=" + i + ", j=" + j);
			    }
			}

	}

}
