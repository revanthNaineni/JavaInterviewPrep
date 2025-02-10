package asynchronization;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Test {
	
	public static void main(String[] args) {
		Map<Integer, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put(1, 100);
        hashMap.put(2, 200);
        hashMap.put(3, 300);
        
        hashMap.forEach((key,value)->{
        	System.out.println(key);
        	System.out.println(value);
        });
		
	}

}
