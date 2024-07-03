package strings;

public class StringJava11Indent {

	public static void main(String[] args) {
		String text = "Hello, World!";
		String indentedText = text.indent(4);
		System.out.println(indentedText); // Output: "    Hello, World!"
		
		String text2 = " Hello, Dembele!";
		String indentedText2 = text2.indent(-4);
		System.out.println(indentedText2); 
		
		String text3 = "    Hello, Dembele!";
		String indentedText3 = text3.indent(-4);
		System.out.println(indentedText3); 

	}

}
