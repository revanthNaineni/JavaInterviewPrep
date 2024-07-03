package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class QArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(7);
		list.add(3);
		list.add(3);
		list.add(1);
		list.add(7);
		list.add(3);
		list.add(3);
		list.add(1);
		list.add(7);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(1);
		list.add(7);
		list.add(3);
		list.add(3);
		// System.out.println(list);
		Iterator<Integer> iterator = list.iterator();
		/*
		 * Stream<Integer> stream = list.stream(); Consumer<Integer> action = new
		 * Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) { System.out.println(t);
		 * 
		 * } }; stream.forEach(action);
		 */

		for (int i = 0; i < list.size(); i++) {
			if (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}

		list.add(0, 4);
		System.out.println(list.get(0));

		list.remove(0); // list.forEach(action);

		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) { // TODO Auto-generated
				return o1 - o2;
			}
		};
		list.sort(c);
		System.out.println(list);
		list.stream().sorted().forEach(System.out::print); // list.removeIf(n->n==3);
		List<Integer> subList = list.subList(0, 3);

		subList.addAll(list);
		Object array[] = subList.toArray();
		System.out.println(array[0]);
		System.out.println("sublist " + subList);
		System.out.println("sorted list" + list);
		System.out.println(list.contains(3));
		list.clear();

		/*
		 * List<Integer> list2 = new ArrayList<>(); list2.add(null); list2.add(2);
		 * list2.add(1); list2.add(2);
		 * 
		 * System.out.println(list2); list2.add(0, null); System.out.println(list2);
		 */
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add(null);
		list3.add(0, "A");
		list3.add(2, "B");
		list3.add(1, "C");
		System.out.println(list3);
		Collections.synchronizedList(list3);
		/*
		 * List<Integer> unmodifiableList = Collections.unmodifiableList(list2);
		 * unmodifiableList.add(4); System.out.println("unmodifiable " +
		 * unmodifiableList);
		 */

		ArrayList<String> list4 = new ArrayList<String>();
		list4.add(" Dembele  rr  ");
		System.out.println(list4.get(0).trim());
		System.out.println(list4.size());
		String set = list4.set(0, "test");
		System.out.println(set);
		System.out.println(list4.add("Ouss"));
	}

}
