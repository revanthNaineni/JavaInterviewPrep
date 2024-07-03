package preandpostIncremetAndDecrement;

public class Test8 {

	public static void main(String[] args) {
		int x = 5;
		int y = x-- - --x + x++;
		System.out.println("x: " + x + ", y: " + y);
	}

}
