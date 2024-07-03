package collections;

import java.util.LinkedHashSet;

public class QLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hashSet=new LinkedHashSet<>();
		hashSet.add(33);
		hashSet.add(-1);
		hashSet.add(58);
		hashSet.add(22);
		hashSet.add(128);
		hashSet.add(-11);
		hashSet.remove(-11);
		System.out.println(hashSet);
		for (Integer integer : hashSet) {
			System.out.println(integer);
		}
		
	}

}
