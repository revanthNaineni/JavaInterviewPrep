package multithreading;

class SharedResource1 {
    private boolean flag = false;

    public void setFlagTrue() {
        flag = true;
    }

    public boolean isFlag() {
        return flag;
    }
}

public class Volatile {
	    public static void main(String[] args) throws InterruptedException {
	        SharedResource1 sharedResource = new SharedResource1();

	        // Thread 1 sets the flag to true
	        Thread thread1 = new Thread(() -> {
	            try {
	            	System.out.println("thread1 is executing");
	                Thread.sleep(1000); // Simulating some work
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            sharedResource.setFlagTrue();
	            System.out.println("Flag set to true by Thread 1");
	        });

	        // Thread 2 checks the flag
	        Thread thread2 = new Thread(() -> {
	        	System.out.println("thread2 is executing");
	        	System.out.println(sharedResource.isFlag());
	            while (!sharedResource.isFlag()) {
	                // Busy-wait until the flag is true
	            }
	            System.out.println("Flag is now true, Thread 2 can proceed");
	        });

	        thread1.start();
	        //thread1.join();
	        thread2.start();
	    }

}
