package arrays;

public class IsMonotonicArray {

	public static void main(String[] args) throws ClassNotFoundException {
		int arr[] = { 1, 2, 2, 1, 3, 7 };
		boolean monoticArray = isMonoticArray(arr);
		System.out.println(monoticArray);
		Class name = Class.forName("arrays.IsMonotonicArray");
		System.out.println(name.getClassLoader());
	}

	private static boolean isMonoticArray(int[] arr) {
		boolean increasing = true;
		boolean decreasing = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				decreasing = false;
			} else if (arr[i] >= arr[i + 1]) {
				increasing = false;
			}
		}
		return increasing || decreasing;
	}

}
