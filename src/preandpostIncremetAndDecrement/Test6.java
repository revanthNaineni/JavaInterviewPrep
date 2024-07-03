package preandpostIncremetAndDecrement;

public class Test6 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 5; i > 0; i--) {
		    sum=sum+ i--;
		}
		
		System.out.println(sum);

	}

}
