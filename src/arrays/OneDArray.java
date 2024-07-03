package arrays;

public class OneDArray {

	public static void main(String[] args) {

		char s[] = { 'h', 'e', 'l', 'l', 'o' };
		int n = s.length;

		char arr[] = new char[n];

		for (int i = n - 1; i >= 0; i--) {

			arr[n - (i + 1)] = s[i];

		}

		System.out.println(arr);

	}

}
