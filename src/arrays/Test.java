package arrays;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int arr[]= {2,3,1,-1,22,12};
		Arrays.sort(arr);
		System.out.println("smallest number : "+arr[0]);
		System.out.println("Largest number : "+arr[arr.length-1]);
	}

}
