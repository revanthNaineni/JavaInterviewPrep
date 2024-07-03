package DS;

public class SumOfEvenPlacesandSumOfOddPlacessinanArray {

	public static void main(String[] args) {

		int arr[] = { 50, 60, 60, 45, 70 };

		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}

		}

		int sumArr[] = new int[2];
		sumArr[0] = evenSum;
		sumArr[1] = oddSum;

		for (int i : sumArr) {
			System.out.println(i);
		}

	}

}
