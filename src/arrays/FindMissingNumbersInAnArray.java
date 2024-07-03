package arrays;

import java.util.Arrays;

public class FindMissingNumbersInAnArray {

	public static void main(String[] args) {
		
		int arr []= {9,3,11,5,10,18};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
			
				
				if(arr[i]-arr[i+1]==1 ||arr[i]-arr[i+1]==0) {
					
				}else {
					int diff=Math.negateExact(arr[i]-arr[i+1]);
					int k=0;
					while(diff>1) {
						++k;
						System.out.println(arr[i]+k);
						diff--;
					}
				}
				
		}
	}

}
