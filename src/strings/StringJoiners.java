package strings;

import java.util.StringJoiner;

public class StringJoiners {

	public static void main(String[] args) {

		StringJoiner joiner=new StringJoiner(":","->","@");
		joiner.add("Ousmane");
		joiner.add("Dembele");
		joiner.add("PSG");
		
		System.out.println(joiner);
	}

}
