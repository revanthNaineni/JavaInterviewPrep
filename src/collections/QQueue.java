package collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QQueue {

	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(7);
		queue.add(-1);
		queue.add(-4);
		//queue.add(null);
		System.out.println(queue);
		
		
		
		  queue.remove(); 
		  System.out.println(queue);
		  System.out.println(queue.element()); 
		  queue.offer(11);
		  System.out.println(queue); 
		  System.out.println(queue.peek()); 
		  queue.poll();
		  System.out.println(queue);
		 
		  
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		System.out.println("after");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		Iterator<Integer> iterator=queue.iterator();
		while(iterator.hasNext()) {
			System.err.println(iterator.next());
		}
		
	}

}
