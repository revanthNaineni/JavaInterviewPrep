package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class QLinkedHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map=new LinkedHashMap<>();
		map.put("pp", -22);
		map.put("revanth", 111);
		map.put("Dembele", 7);
		map.put("Messi", 10);
		map.put("Neymar", 11);
		map.put("pedri", 13);
		map.put("Lewan", 22);
		map.put("Gavi", 22);
		map.put("Stegen", 23);
		map.put("Xavi", 14);
		map.put("Salah", 33);
		map.put("Jude", 10);
		map.put("Cama", 10);
		map.put("Vinga", 10);
		map.put("Jr", 10);
		map.put("Kaka", 10);
		map.put("grizie", 10);
		map.put("Ousmane", 10);
		map.put(null, 10);
		map.put("Reus", null);
		map.put(null, 11);//if we add duplicate key,it will replace with existing value
		map.put("Kaka2", 10);
		map.put("Kaka1", 10);
		map.put("Kaka3", 10);
		map.put("Kaka4", 10);
		map.put("Kaka5", 10);
		map.put("Kaka6", 10);
		map.put("Kaka7", 10);
		map.put("Kaka8", 10);
		map.put("Kaka9", 10);
		map.put("Kaka10", 10);
		
		
		
		
		
		System.out.println(map);
		
	}

}
