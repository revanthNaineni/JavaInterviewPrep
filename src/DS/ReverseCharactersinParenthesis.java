package DS;

public class ReverseCharactersinParenthesis {

	public static void main(String[] args) {

		String s = "foo(bar)baz(blim)";

		reverseInParenthesis(s);

	}

	private static void reverseInParenthesis(String s) {
		final String s2 = s.replace("(", " :").replace(")", ": ");

		final String[] arrStrings = s2.split(" ");

		final StringBuffer stringBuffer = new StringBuffer();

		for (final String string : arrStrings) {
			if (string.contains(":")) {
				final StringBuffer reverseBuffer = new StringBuffer(string.replace(":", "").trim()).reverse();
				stringBuffer.append(reverseBuffer);
			} else {
				stringBuffer.append(string);
			}
		}

		System.out.println(stringBuffer.toString());
	}

}
