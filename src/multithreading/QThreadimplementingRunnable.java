package multithreading;

class ChildThread1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("inside the child thread ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class QThreadimplementingRunnable {

	public static void main(String[] args) throws InterruptedException {
		ChildThread1 childThread=new ChildThread1();
		Thread thread=new Thread(childThread);
		thread.start();
		System.out.println("inside main method before join");
		thread.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("inside the main thread ");
		}
	}

}
