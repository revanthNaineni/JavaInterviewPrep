package multithreading;
public class NonAtomicExample {
    private int counter = 0;

    public void increment() {
        counter++; // Not thread-safe
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        NonAtomicExample example = new NonAtomicExample();

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
