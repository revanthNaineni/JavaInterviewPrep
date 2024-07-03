package strings;

public class StringJava11IsBlank {

	public static void main(String[] args) {
		String s1=" ";
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		System.out.println();
		
		String s2="";
		System.out.println(s2.isBlank());
		System.out.println(s2.isEmpty());
		System.out.println();
		
		String s3="   Re";
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		System.out.println();
		
		String s4="\t";
		System.out.println(s4.isBlank());
		System.out.println(s4.isEmpty());
		System.out.println();
		
		String s5="\n";
		System.out.println(s5.isBlank());
		System.out.println(s5.isEmpty());
		System.out.println();
		
		String s6="\r";
		System.out.println(s6.isBlank());
		System.out.println(s6.isEmpty());
		System.out.println();
		
		String s7="\f";
		System.out.println(s7.isBlank());
		System.out.println(s7.isEmpty());
		System.out.println();
	}

}
