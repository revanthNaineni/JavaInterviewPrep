package assessmentIBM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	 public static int calculateScoreDifference(int n, List<Integer> numSeq) {
		 
		 int firstPlayerscore=0;
		 int secondPlayerscore=0;
		 for (int i = 0; i < n; i++) {
			 int removedNo=numSeq.remove(0);
			 if(i%2==0) {
				 firstPlayerscore+=removedNo;
				 if(removedNo%2==0) {
					 Collections.reverse(numSeq);
				 }
			 }else {
				 secondPlayerscore+=removedNo;
				 if(removedNo%2==0) {
					 Collections.reverse(numSeq);
				 }
			 }
			
		}
		 
		 return firstPlayerscore-secondPlayerscore;
	 }

	public static void main(String[] args) {
		int n = 5;
		List<Integer> numSeq = new ArrayList<>(List.of(3, 6, 2, 3, 5));
        int scoreDifference = calculateScoreDifference(n, numSeq);
        System.out.println("Score Difference: " + scoreDifference);

	}

}
