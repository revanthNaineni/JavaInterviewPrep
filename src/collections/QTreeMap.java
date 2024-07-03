package collections;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class QTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<>();
		map.put(3, "Three");
		map.put(5, "Five");
		map.put(2, "Two");
		map.put(1, "One");
		map.put(4, "Four");
		map.put(6, null);
		map.put(7, null);
		map.put(7, "Seven");
		map.put(3, "Bakky");
		map.put(4, "Bakky");
		map.put(5, "Bakky");
		map.put(6, "Bakky");
		map.put(7, "Bakky");
		map.put(8, "Bakky");
		map.put(9, "Bakky");
		map.put(10, "Bakky");
		map.put(11, "Bakky");
		map.put(12, "Bakky");
		map.put(13, "Bakky");
		map.put(14, "Bakky");
		map.put(15, "Bakky");
		map.put(16, "Bakky");
		map.put(17, "Bakky");
		map.put(18, "Bakky");
		map.put(19, "Bakky");
		map.put(20, "Bakky");
		map.put(21, "Bakky");
		map.put(22, "Bakky");
		map.put(23, "Bakky");
		map.put(24, "Bakky");
		map.put(25, "Bakky");//if we add duplicate key,it will replace with existing value
		//map.put(null, "null");runtime error as we cant store null as key in TreeMap
		
		System.out.println(map);
		Entry<Integer, String> ceilingEntry = map.ceilingEntry(-1);
		System.out.println(ceilingEntry);
		System.out.println(map.ceilingKey(1));
		System.out.println(map.descendingKeySet());
		System.out.println(map.descendingMap());
		System.out.println(map.firstKey());
		System.out.println(map.floorKey(99));
		System.out.println(map.higherKey(1));
		System.out.println(map.lastKey());
		System.out.println(map.ceilingEntry(3));
		System.out.println(map.firstEntry());
		System.out.println(map.navigableKeySet());
		System.out.println(map.subMap(2, 4));
		System.out.println(map.tailMap(4));
		
	}

}
