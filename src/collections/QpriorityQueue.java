package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QpriorityQueue {

	public static void main(String[] args) {
		
		Queue<String> queue=new PriorityQueue<>();
		queue.add("hello333");
		queue.add("hello");
		queue.add("hello");
		queue.add("hello1");
		queue.add("hello4444");
		queue.add("hello22");
		//queue.add(null);
		
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		
		Queue<String> queue1=new PriorityQueue<>(Comparator.reverseOrder());
		queue1.add("hello333");
		queue1.add("hello");
		queue1.add("hello1");
		queue1.add("hello4444");
		queue1.add("hello22");
		//queue.add(null);
		
		System.out.println(queue1);
		queue1.poll();
		System.out.println(queue1);
	}

}
