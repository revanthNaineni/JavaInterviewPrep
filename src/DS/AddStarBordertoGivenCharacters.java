package DS;

public class AddStarBordertoGivenCharacters {

	public static void main(String[] args) {

		String arr[] = { "abc", "ded","dem","ous" };

		String first = "";
		String last = "";

		String borderArr[] = new String[arr.length + 2];
		
		for (int j = 0; j < arr[0].length()+2; j++) {

			first = first + "*";
			last = last + "*";

		}

		borderArr[0] = first;
		borderArr[borderArr.length - 1] = last;

		for (int i = 0; i < arr.length; i++) {

			String str = "*" + arr[i] + "*";

			borderArr[i+1]=str;

			

		}
		
		for (String string : borderArr) {
			System.out.println(string);
		}

	}

}
