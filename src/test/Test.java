package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

//0 1 1 2 3 5 8 13
 
 public class Test<K,V> extends LinkedHashMap<K, V>{
	 
	 private int capacity;
	 
	 public Test(int capacity) {
		 super(capacity, 0.75f, true);
		 this.capacity=capacity;
	}
	 
	 @Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return size()>capacity;
	}
	 
	 
	 public static void main(String[] args) {
		Test<Integer, Integer> test=new Test<Integer, Integer>(3);
		test.put(1, 1);
		test.put(2, 2);
		test.put(3, 3);
		
		System.out.println(test);
		
		test.get(1);
		
		System.out.println(test);
		
		test.put(4, 4);
		
		System.out.println(test);
		
		
	}
	 
 }
