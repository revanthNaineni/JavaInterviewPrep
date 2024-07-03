package preandpostIncremetAndDecrement;

public class Test10 {
	public static void main(String[] args) {

			int a = 5;
			int b = a++ - --a + a-- + ++a;
			System.out.println("a: " + a + ", b: " + b);
			
			//5-5+5+5


	}

}
