package multithreading;

public class QThreadusingLambdaExpression {

	public static void main(String[] args) {
		Thread thread=new Thread(()->System.out.println("Hello Lambda Thread"));
		
		thread.start();
		

	}

}
