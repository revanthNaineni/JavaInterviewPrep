package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LargestAdjacentProductfromGivenArrayBySelectingTwoAdjacentNumbers {

	public static void main(String[] args) {

		int arr[] = { 3, 6, -2,11, -5,12, 7, 3,22 ,2,};
		System.out.println(adjacentElementProduct(arr));

	}

	private static int adjacentElementProduct(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j <= i + 1; j++) {
				list.add(arr[i] * arr[j]);
			}

		}

		return Collections.max(list);
	}

}
