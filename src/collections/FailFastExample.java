package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        Iterator<String> iterator = list.iterator();

		
		/*
		 * while (iterator.hasNext()) { String element = iterator.next();
		 * System.out.println(element); list.add("orange"); }
		 */
		 
        
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("apple")) {
            	iterator.remove();
            }
            //list.add("orange");
        }
        System.out.println(list);
    }
}
