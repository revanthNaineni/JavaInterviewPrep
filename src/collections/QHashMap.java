package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QHashMap {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		/*
		 * map.put("bb", 33); map.put("bb", 43); map.put(null, 53);
		 */
		
		map.put(1, "Revanth");
		map.put(2, "Vicky");
		map.put(22, "Vickyyy");
		map.put(-23, "Vickyyy");
		map.put(4, null);
		map.put(null, "Dembele");
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
		map.put(25, "Bakky");
		
		System.out.println(map.put(10, "Dembouzz"));
		map.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);
		});
		Set<Integer> keySet = map.keySet();
		System.out.println(map);
		String name=map.get(1);
		
		System.out.println(map.get(1));
		Set<Integer> keySet1 = map.keySet();
		System.out.println(keySet1);
		for (Integer integer : keySet1) {
			System.out.println(map.get(integer));
		}
		Collection<String> values = map.values();
		System.out.println(values);
		map.remove(1);
		System.out.println(map);
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		entrySet.forEach(System.out::println);
		System.out.println("entryset "+entrySet);
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+": " +entry.getValue());
		}
		List<Map<Integer, String>> list = new ArrayList<>();
		list.add(map);
		System.out.println(list);
		 
		
	}

}
