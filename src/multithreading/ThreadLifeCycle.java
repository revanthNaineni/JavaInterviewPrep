package multithreading;

class LFC extends Thread{
	@Override
	public void run() {
		System.out.println("Hello");
	}
	
}

public class ThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		LFC lfc=new LFC();
		System.out.println(lfc.getState());
		lfc.start();
		System.out.println(lfc.getState());
		lfc.join();
		System.out.println(lfc.getState());
		lfc.sleep(1000);
		System.out.println(lfc.getState());
	}

}
