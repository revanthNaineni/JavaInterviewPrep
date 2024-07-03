package breezyInterview;

import java.util.Iterator;

//Input: nums = [2,7,11,15], target = 9 or 24 -- Output: [0,1] or [0,1,3]
public class ArrayTarget {

	public static void main(String[] args) {
		
		int [] num= {2,7,11,15};
		
		int target=13;
		
		
		int[] targetIndices = findTargetIndices(num, target);
		
		for (int i : targetIndices) {
			System.out.println(i);
		}

	}

	private static int [] findTargetIndices(int[] num, int target) {
		boolean found=true;
		
		if(found) {
			int targetArr [] =new int[2];
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]+num[j]==target) {
					targetArr[0]=i;
					
					targetArr[1]=j;
					return targetArr;
				}
			}
		}
		found=false;
		}
		
		if(!found){
			int targetArr [] =new int[3];
			for (int i = 0; i < num.length-2; i++) {
				for (int j = i+1; j < num.length-1; j++) {
					for (int k = j+1; k < num.length; k++) {
					if(num[i]+num[j]+num[k]==target) {
						targetArr[0]=i;
						
						targetArr[1]=j;
						targetArr[2]=k;
						return targetArr;
					}
					}
				}
			}
	}
		return null;
	}

}
