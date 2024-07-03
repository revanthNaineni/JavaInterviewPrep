package sorting;

public class QuickSort {

	  public static void sort(int[] array) {
	    quickSort(array, 0, array.length - 1);
	  }

	  private static void quickSort(int[] array, int low, int high) {
	    if (low < high) {
	      // Partition the array around the pivot element
	      int pivotIndex = partition(array, low, high);

	      // Recursively sort the sub-arrays
	      quickSort(array, low, pivotIndex - 1);
	      quickSort(array, pivotIndex + 1, high);
	    }
	  }

	  private static int partition(int[] array, int low, int high) {
	    int pivot = array[high];
	    int i = (low - 1); // index of smaller element

	    for (int j = low; j <= high - 1; j++) {
	      // If current element is smaller than the pivot
	      if (array[j] < pivot) {
	        i++;
	        // Swap elements
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	      }
	    }

	    // Place the pivot element in its correct position
	    int temp = array[i + 1];
	    array[i + 1] = array[high];
	    array[high] = temp;

	    return (i + 1);
	  }

	  public static void main(String[] args) {
	    int[] data = {8, 7, 2, 1, 3, 5, 4};
	    sort(data);
	    for (int i : data) {
	      System.out.print(i + " ");
	    }
	    System.out.println();
	  }
	}

