package multithreading;

class Counter{
	static int count;
	
	public static void printCount() {
		System.out.println(count);
	}
}

class T1 extends Thread{
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			Counter.count++;
		}
	}
}

class T2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Counter.count++;
		}
	}
}
public class Test {

	public static void main(String[] args) throws InterruptedException {
		T1 t1=new T1();
		T2 t2=new T2();
		t1.start();
		t2.start();
		Counter.printCount();
		t1.join();
		t2.join();
		Counter.printCount();
		

	}

}
