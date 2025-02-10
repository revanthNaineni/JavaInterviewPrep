package multithreading;

public class QThreadusingLambdaExpression {

	public static void main(String[] args) {
		Thread thread=new Thread(()->System.out.println("Hello Lambda Thread"));
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread());
		
		thread.start();
		System.out.println(Thread.currentThread());
		
		System.out.println(Thread.activeCount());

	}

}
