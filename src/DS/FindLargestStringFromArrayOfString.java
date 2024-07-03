package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLargestStringFromArrayOfString {

	public static void main(String[] args) {

		String arr[] = { "aba", "aa", "ad", "abassssss", "abassssss" };

		String[] allLongestStrings = allLongestStrings(arr);
		for (String string : allLongestStrings) {
			System.out.println(string);
		}

	}

	private static String[] allLongestStrings(String[] arr) {
		String max = "";
		List<String> list = new ArrayList<String>();
		/*
		 * for (String string : arr) { list.add(string); }
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].length() > arr[i + 1].length()) {
					max = arr[i];
				} else {
					max = arr[i + 1];
				}
			}

		}

		int count = 0;
		for (String string : arr) {
			if (string.length() == max.length()) {
				list.add(string);
			}
		}
		String longStringsArr[] = new String[list.size()];
		for (String string : list) {
			longStringsArr[count] = string;
			count++;
		}

		return longStringsArr;
	}

}
