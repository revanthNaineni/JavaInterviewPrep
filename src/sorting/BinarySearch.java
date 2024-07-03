package sorting;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid; // Element found at index 'mid'
			}

			if (arr[mid] < target) {
				left = mid + 1; // Target is in the right half
			} else {
				right = mid - 1; // Target is in the left half
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 3, 5, 7, 9, 10, 12, 13,17 };
		int target = 14;

		int position = binarySearch(arr, target);
		if(position==-1) {
			System.out.println(target+" element not found in the array" );
		}else if(arr[position]==target) {
			System.out.println(target+" element found at "+position +"th index in the array");
		}
	}

}
