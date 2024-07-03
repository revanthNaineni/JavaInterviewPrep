package multithreading;

class ChildThread extends Thread{
	
	public ChildThread(String tName) {
		super(tName);
	}
	 @Override
	public void run() {
		 
		for (int i = 0; i < 10; i++) {
			System.out.println("inside the child thread "+Thread.currentThread().getName());
		}
		System.out.println(Thread.activeCount());
	}
}

class ChildThread2 extends Thread{
	 @Override
	public void run() {
		 
		for (int i = 0; i < 10; i++) {
			System.out.println("inside the child thread 2");
		}
	}
}

public class QThreadExtendingThread {

	public static void main(String[] args) throws InterruptedException {
		ChildThread childThread=new ChildThread("Revanth");
		ChildThread2 childThread2=new ChildThread2();
		childThread.start();
		childThread.sleep(10000);
		childThread2.start();
		//childThread.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("inside the main thread ");
		}
		
	}

}
