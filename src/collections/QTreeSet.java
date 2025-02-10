package collections;

import java.util.TreeSet;

public class QTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(33);
		set.add(-1);
		set.add(58);
		set.add(22);
		set.add(128);
		set.add(-11);
		//hashSet.add(null);
		
		System.out.println(set);
		System.out.println(set.higher(22));
		System.out.println(set.pollFirst());
		System.out.println(set.first());
		System.out.println(set.last());
	}

}
