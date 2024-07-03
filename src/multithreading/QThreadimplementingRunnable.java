package multithreading;

class ChildThread1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("inside the child thread ");
		}
		
	}
	
}

public class QThreadimplementingRunnable {

	public static void main(String[] args) {
		ChildThread1 childThread=new ChildThread1();
		Thread thread=new Thread(childThread);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("inside the main thread ");
		}
	}

}
