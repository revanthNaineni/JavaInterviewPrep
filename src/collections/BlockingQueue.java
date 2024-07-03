package collections;

import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueue {
    public static void main(String[] args) {
        java.util.concurrent.BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(11); // Create a blocking queue with a capacity of 10
        // Producer thread
        //BlockingQueue<String> queue1 = new LinkedBlockingQueue<>();
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    queue.put(i); // Insert elements into the queue (blocks if the queue is full)
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    int value = queue.take(); // Retrieve elements from the queue (blocks if the queue is empty)
                    System.out.println("Consumed: " + value);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        // Start producer and consumer threads
        producer.start();
        consumer.start();
    }
}

