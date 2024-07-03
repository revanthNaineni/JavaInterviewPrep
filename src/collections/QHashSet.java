package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class QHashSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(-1);
		set.add(2);
		set.add(23);
		set.add(11);
		set.add(2);
		set.add(null);
		set.add(null);
		set.remove(3);
		System.out.println(set);
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);

		}
		
	}

}
