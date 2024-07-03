package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SumOfFirstHalfOfTicketIsEqualsToLastHalf {

	public static void main(String[] args) {

		int n = 239017;

		boolean lucky = isLucky(n);

		System.out.println(lucky);

	}

	private static boolean isLucky(int n) {
		int firstHalfSum = 0;
		int lastHalfSum = 0;

		List<Integer> list = new ArrayList<Integer>();

		while (n > 0) {
			int num = n % 10;
			list.add(num);

			n = n / 10;
		}

		Collections.reverse(list);

		// System.out.println(list);

		for (int i = 0; i < list.size() / 2; i++) {
			firstHalfSum += list.get(i);
		}
		for (int i = list.size() - 1; i >= list.size() / 2; i--) {
			lastHalfSum += list.get(i);
		}

		// System.out.println(firstHalfSum);
		// System.out.println(lastHalfSum);

		if (firstHalfSum == lastHalfSum) {
			return true;
		} else {
			return false;
		}
	}

}
