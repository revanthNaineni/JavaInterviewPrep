package multithreading;

class Counter1 {

	int count;

	public void countIncrement() {

		synchronized (this) {
			for (int i = 0; i < 500; i++) {
				count++;
			}
		}

		System.out.println(count);

	}

}

public class SynchronizationBlockExample {

	public static void main(String[] args) {
		Counter1 counter = new Counter1();

		/*
		 * Runnable runnable1 = () -> { counter.countIncrement(); }; Runnable runnable2
		 * = () -> { counter.countIncrement(); }; Runnable runnable3 = () -> {
		 * counter.countIncrement(); };
		 * 
		 * Thread thread1 = new Thread(runnable1); Thread thread2 = new
		 * Thread(runnable2); Thread thread3 = new Thread(runnable3);
		 * 
		 * thread1.start(); thread2.start(); thread3.start();
		 */
		
		counter.countIncrement();
	}

}
