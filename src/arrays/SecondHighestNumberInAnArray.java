package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SecondHighestNumberInAnArray {

	public static void main(String[] args) {

		int arr[] = { 3, -12, 33, 33,41, 44, 44, 11, 9, 12, -2, 24, 19 };
		TreeSet<Integer> hashSet = new TreeSet<>();

		for (int i : arr) {
			hashSet.add(i);
		}
		System.out.println(hashSet);
		Integer[] array = hashSet.toArray(Integer []::new);

		System.out.println("second highest element " + array[array.length - 2]);

	}

}
