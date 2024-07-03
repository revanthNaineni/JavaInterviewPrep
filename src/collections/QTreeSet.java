package collections;

import java.util.TreeSet;

public class QTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> hashSet=new TreeSet<>();
		hashSet.add(33);
		hashSet.add(-1);
		hashSet.add(58);
		hashSet.add(22);
		hashSet.add(128);
		hashSet.add(-11);
		//hashSet.add(null);
		
		System.out.println(hashSet);
		System.out.println(hashSet.higher(22));
		
	}

}
