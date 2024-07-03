package strings;

//A pangram is a sentence that contains every letter of the alphabet at least once.
public class Pangram {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over a lazy dog";

		System.out.println(isPangram(str));

	}

	private static boolean isPangram(String str) {
		if (str.length() < 26) {
			return false;
		} else {
			for (char i = 'a'; i <= 'z'; i++) {
				if (str.toLowerCase().indexOf(i) < 0) {
					return false;
				}
			}
			return true;
		}
	}

}
