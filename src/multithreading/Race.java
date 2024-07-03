package multithreading;

public class Race{

	public static void main(String[] args) throws InterruptedException {

		RaceConditions conditions = new RaceConditions();
		Runnable runnable1 = () -> {
			for (int i = 1; i <= 15000; i += 50) {
				conditions.incrementBrickCount();
			}
		};

		Runnable runnable2 = () -> {
			for (int i = 1; i <= 10000; i += 50) {
				conditions.incrementBrickCount();
			}
		};
		Runnable runnable3 = () -> {
			for (int i = 1; i <= 5000; i += 50) {
				conditions.incrementBrickCount();
			}
		};

		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable2);
		Thread t3 = new Thread(runnable3);
		//System.out.println(Thread.activeCount());
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		

		System.out.println(conditions.brickCount);
		System.out.println(conditions.brickCount2);
	}

}