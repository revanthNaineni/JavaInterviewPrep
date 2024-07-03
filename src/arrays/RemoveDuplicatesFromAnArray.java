package arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) {
		int arr[]= {3,4,4,6,7,9,7,11,11};
		
		HashSet<Integer> hashSet=new HashSet<Integer>();
		for (int element : arr) {
			hashSet.add(element);
		}
		
		System.out.println(hashSet);
		
		Integer[] array = hashSet.toArray(Integer []::new);
		for (Integer integer : array) {
			System.out.println(integer);
		}
	}

}
