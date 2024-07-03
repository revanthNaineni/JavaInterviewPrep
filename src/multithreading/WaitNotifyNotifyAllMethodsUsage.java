package multithreading;


public class WaitNotifyNotifyAllMethodsUsage {
	

    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(() -> sharedResource.useResource("Thread 1"));
        Thread thread2 = new Thread(() -> sharedResource.useResource("Thread 2"));
        Thread thread3 = new Thread(() -> sharedResource.useResource("Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();
        
        thread1.join();
        thread2.join();
        thread3.join();
    }


}
