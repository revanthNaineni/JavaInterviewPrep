package escapeCharacters;

public class EscapeCharactersExample {
	public static void main(String[] args) {
		
		String s1="Hello \"'World";
		System.out.println(s1);
		
		System.out.println("\"Java\" is an object-oriented programming language.");  
		System.out.println("Wall Street\'s");
		System.out.println("'JavaTpoint'");
		System.out.println("My work files are in D:\\Work Projects\\java");
		
		String s2="My work files are in D:|Work Projects|java";
		String[] split = s2.split("\\|");
		for (String string : split) {
			System.out.println(string);
		}
		
		String s3="ABC001|login not working|12-Nov-2023|Revanth|open#ABC101|balance check not working|12-Nov-2023|Revanth|closed#ABC002|dashboard not working|13-Nov-2023|sumanth|open";
		System.out.println(s3);
		String[] split2 = s3.split("\\|");
		for (String string : split2) {
			System.out.println(string);
		}
		
	}
}