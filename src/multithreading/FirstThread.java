package multithreading;

public class FirstThread {

	public static void main(String[] args) {
		
		Thread thread1=new Thread(); 
		System.out.println(Thread.activeCount());
		Thread thread2=new Thread(); 
		System.out.println(Thread.activeCount());
		Thread thread3=new Thread(); 
		System.out.println(Thread.activeCount());
		Thread thread4=new Thread(); 
		System.out.println(Thread.activeCount());
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		//System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.activeCount());
		System.out.println(Thread.activeCount());
	}

}
