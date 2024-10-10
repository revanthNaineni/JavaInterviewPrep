package collections;

import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueue {
    public static void main(String[] args) {
        java.util.concurrent.BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(11); // Create a blocking queue with a capacity of 10
        // Producer thread
        //BlockingQueue<String> queue1 = new LinkedBlockingQueue<>();
        Thread producer1 = new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    queue.put(i); // Insert elements into the queue (blocks if the queue is full)
                    System.out.println("Produced1: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        // Consumer thread
        Thread consumer1 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    int value = queue.take(); // Retrieve elements from the queue (blocks if the queue is empty)
                    System.out.println("Consumed1: " + value);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread producer2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
			    queue.offer(i); // Insert elements into the queue (blocks if the queue is full)
			    System.out.println("Produced2: " + i);
			}
        });
        
        // Consumer thread
        Thread consumer2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
			    int value = queue.poll(); // Retrieve elements from the queue (blocks if the queue is empty)
			    System.out.println("Consumed: " + value);
			}
        });
        
        // Start producer and consumer threads
        producer1.start();
        consumer1.start();
        
        producer2.start();
        consumer2.start();
    }
}

