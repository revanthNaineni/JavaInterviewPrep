package preandpostIncremetAndDecrement;
public class Test {
	public static void main(String[] args) {
		int a = 10;
		int c = a++ + ++a;
		System.out.println(c);
	}
}