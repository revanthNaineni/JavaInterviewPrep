package leetcode;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {

	public static void main(String[] args) {
		
		int arr[]= {1,3,4,8,7,9,3,5,1};
		Arrays.sort(arr);
		int k=2;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[i]-arr[j]<=k) {
					
				}
			}
		}

	}

}
