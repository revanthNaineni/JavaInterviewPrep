package breakAndContinue;

public class QBreakWithLabels {

	public static void main(String[] args) {
		 outer:   //Label
		for (int i = 0; i < 10; i++) {
			System.out.println("Outer "+i);
			inner:  //Label
			for (int j = 0; j < 9; j++) {
				
			  if (j == 5) {
			    break inner;
			  }
			  System.out.println("inner "+j);  // Prints numbers from 0 to 4
			}
		}

	}

}
