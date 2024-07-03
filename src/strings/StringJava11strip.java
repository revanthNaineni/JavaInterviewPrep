package strings;

public class StringJava11strip {

	public static void main(String[] args) {
		String s1=" Hello World  ";
		System.out.println(s1.strip());
		System.out.println(s1.trim());
		System.out.println();
		
		String s2 = "\u200B  Hello, World!  \\u200B";
		System.out.println(s2.strip().length());
		System.out.println(s2.trim().length());
		
		String s3=" Hello World  ";
		System.out.println(s3.stripLeading());
		System.out.println(s3.strip());
		System.out.println();
		
		String s4=" Hello World  ";
		System.out.println(s4.stripTrailing());
		System.out.println(s4.strip());
	}

}
