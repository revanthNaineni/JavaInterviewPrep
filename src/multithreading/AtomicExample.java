package multithreading;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private AtomicInteger counter = new AtomicInteger();

    public void increment() {
        counter.incrementAndGet(); // Atomic operation
    }

    public int getCounter() {
        return counter.get(); // Retrieve the value atomically
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicExample example = new AtomicExample();

        // Create multiple threads
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // Start threads
        t1.start();
        t2.start();

        // Wait for threads to finish
        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + example.getCounter());
    }
}
