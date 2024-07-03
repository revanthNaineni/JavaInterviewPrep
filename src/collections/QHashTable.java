package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class QHashTable {

	public static void main(String[] args) {
		Map<Integer, String> map=new Hashtable<>();
		map.put(1, "Revanth");
		map.put(2, "Vicky");
		map.put(3, "Bakky");
		map.put(4, null);
		map.put(null, "Dembele");
		System.out.println(map);
		System.out.println(map.get(1));
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		for (Integer integer : keySet) {
			System.out.println(map.get(integer));
		}
		Collection<String> values = map.values();
		System.out.println(values);
		map.remove(1);
		System.out.println(map);
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		List<Map<Integer, String>> list=new ArrayList<>();
		list.add(map);
		System.out.println(list);
	}

}
