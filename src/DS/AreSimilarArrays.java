package DS;

import java.util.Arrays;

public class AreSimilarArrays {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3 };

		int arr2[] = { 3,2,1,3 };
		boolean areSimilarArrays = areSimilarArrays(arr1, arr2);

		System.out.println(areSimilarArrays);
	}

	private static boolean areSimilarArrays(int[] arr1, int[] arr2) {
		int count = 0;
		if (Arrays.equals(arr1, arr2)) {

			count++;
			return true;

		} else if (arr1.length != arr2.length) {
			return false;
		} else {

			for (int i = 0; i < arr2.length-1; i++) {
				if (arr2[i] > arr2[i + 1]) {
					int temp = arr2[i];
					arr2[i] = arr2[i + 1];
					arr2[i + 1] = temp;
					if (Arrays.equals(arr1, arr2)) {
						return true;
					} else {
						int temp2 = arr2[i + 1];
						arr2[i + 1] = arr2[i];
						arr2[i] = temp2;
					}
				}
			}

			return false;

		}
	}

}
