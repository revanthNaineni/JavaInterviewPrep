package multithreading;
public class SynchronizedExampleForAtomicity {
    private int counter = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        counter++;
    }

    // Method to get the counter value
    public synchronized int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample example = new SynchronizedExample();

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

        System.out.println("Final Counter Value (Synchronized): " + example.getCounter());
    }
}
