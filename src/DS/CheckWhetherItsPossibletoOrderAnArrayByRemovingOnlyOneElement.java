package DS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckWhetherItsPossibletoOrderAnArrayByRemovingOnlyOneElement {

	public static void main(String[] args) {

		int arr[] = {3, 2,1 };

		if (arr.length == 1) {
			System.out.println(true);
		} else {

			boolean almostIncreasingSequence = almostIncreasingSequence(arr);
			System.out.println(almostIncreasingSequence);
		}

	}

	public static boolean almostIncreasingSequence(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			list2.add(arr[i]);
		}

		for (int i = 0; i < list.size(); i++) {
			int removedNumber = list.get(i);
			list.remove(i);
			list2.remove(i);
			// List<Integer> list2=list;
			System.out.println(list2);
			List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
			System.out.println(list);
			if (isListEquals(sortedList, list2)) {
				// break;
				return true;
			} else {
				list.add(i, removedNumber);
				list2.add(i, removedNumber);
			}
		}

		return false;
	}

	public static boolean isListEquals(List<Integer> list1, List<Integer> list2) {
		for (int i = 0; i < list1.size(); i++) {

			if (list1.get(i) == list2.get(i)) {

			} else {
				return false;
			}

		}
		return true;

	}

}
