package multithreading;

class ChildThread extends Thread{
	
	public ChildThread(String tName) {
		super(tName);
	}
	 @Override
	public void run() {
		 
		for (int i = 0; i < 10; i++) {
			System.out.println("inside the child thread "+Thread.currentThread().getName());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.activeCount());
	}
}

class ChildThread2 extends Thread{
	 @Override
	public void run() {
		 
		for (int i = 0; i < 10; i++) {
			System.out.println("inside the child thread 2");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println(Thread.activeCount());
	}
}

public class QThreadExtendingThread {

	public static void main(String[] args) throws InterruptedException {
		ChildThread childThread=new ChildThread("Revanth");
		ChildThread2 childThread2=new ChildThread2();
		childThread.start();
		Thread.sleep(10000);
		childThread2.start();
		childThread.join();
		
		  for (int i = 0; i < 10; i++) {
			  System.out.println("inside the main thread ");
		  }
		 
		
	}

}
