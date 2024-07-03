package DS;

public class CalculatetheSumFromGivenString {

	public static void main(String[] args) {

		String str = "2 apples, 12 Oranges , 18 Banana10";

		String[] split = str.split(" ");
		int sum=0;
		for (String string : split) {

			if ((string.contains("0") || string.contains("1") || string.contains("2") || string.contains("3")
					|| string.contains("4") || string.contains("5") || string.contains("6") || string.contains("7")
					|| string.contains("8") || string.contains("9"))) {
				System.out.println(string);
				sum+=Integer.parseInt(string);
			}
		}
		
		System.out.println(sum);
	}

}
