package googleInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Given n number of LinkedList with some integer data.Merge all the LinkedLists and sort by descending order

public class MergeLinkedLists {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(2001);
		list1.add(-946);
		list1.add(22);
		list1.add(3200);

		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(89);
		list2.add(111);
		list2.add(48);
		list2.add(-200);

		LinkedList<Integer> list3 = new LinkedList<Integer>();
		list3.add(760);
		list3.add(-2);
		list3.add(356);
		list3.add(10000);
		List<LinkedList<Integer>> nlists = new ArrayList<LinkedList<Integer>>();
		nlists.add(list1);
		nlists.add(list2);
		nlists.add(list3);

		mergeAndSortLinkedLists(nlists);
		

	}

	private static void mergeAndSortLinkedLists(List<LinkedList<Integer>> lists) {
		LinkedList<Integer> mergedList = new LinkedList<Integer>();
		for (LinkedList<Integer> linkedList : lists) {
			mergedList.addAll(linkedList);
		}

		Collections.sort(mergedList);
		System.out.println(mergedList);
	}

}
