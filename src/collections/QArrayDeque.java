package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QArrayDeque {

	public static void main(String[] args) {  
		Deque<Integer> arrayDeque=new ArrayDeque<>();
		arrayDeque.add(33);
		arrayDeque.add(7);
		arrayDeque.add(11);
		arrayDeque.add(-3);
		arrayDeque.add(44);
		arrayDeque.add(44);
		//arrayDeque.add(null);
		
		System.out.println(arrayDeque);
		arrayDeque.offer(23);
		arrayDeque.offerFirst(-43);
		arrayDeque.offerLast(1000);
		System.out.println(arrayDeque);
		arrayDeque.poll();
		System.out.println(arrayDeque);
		
		  Deque<Integer> arrayDeque1=new ArrayDeque<>(3); 
		  arrayDeque1.add(33);
		  arrayDeque1.add(7);
		  arrayDeque1.add(11); 
		  arrayDeque1.add(-3);
		  arrayDeque1.add(44); 
		  arrayDeque1.add(44); 
		  System.out.println(arrayDeque1);
	}

}
