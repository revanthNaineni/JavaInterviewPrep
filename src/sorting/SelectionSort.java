package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;

		System.out.println("Original Array:");
		printArray(arr);

		// Perform the selection sort
		selectionSort(arr);

		System.out.println("\nSorted Array:");
		printArray(arr);
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in the unsorted part of the array
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Swap the found minimum element with the first element of the unsorted part
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}

