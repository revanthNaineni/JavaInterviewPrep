package multithreading;
class ThreadA extends Thread {
    public void run() {
        System.out.println("Thread A is plasting the house.");
        try {
            Thread.sleep(2000); // Simulate coloring time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread A finished plasting.");
    }
}

class ThreadB extends Thread {
    ThreadA threadA;
    
    public ThreadB(ThreadA threadA) {
        this.threadA = threadA;
    }
    
    public void run() {
        try {
            threadA.join(); // Wait for Thread A to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread B is colouring the house after the plasting is completed.");
    }
}

public class ThreadJoinMethod {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB(threadA);
        
        threadA.start(); // Start plasting
        threadB.start(); // Start coloring, but wait for plasting to finish
    }
}