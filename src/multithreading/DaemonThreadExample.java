package multithreading;
class MyDaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is working in the background...");
            try {
                Thread.sleep(1000); // Pauses for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        MyDaemonThread daemonThread = new MyDaemonThread();
        daemonThread.setDaemon(true); // Set this thread as a daemon thread
        
        daemonThread.start();  // Start the daemon thread
        
        // Main thread work
        System.out.println("Main thread is working...");
        try {
            Thread.sleep(3000); // Main thread pauses for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread is done.");
    }
}