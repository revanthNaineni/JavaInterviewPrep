package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestClass {
	public static void main(String[] args) {
		List<Integer> list=new Vector<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(1);
		list.remove(2);
		list.remove(3);
		
		
		
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer integer =iterator.next();
			System.out.println(integer);
			
		}
	}
}