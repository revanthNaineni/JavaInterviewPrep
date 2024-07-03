package strings;

public class StringConcatwithOtherDatatypes {
	
	public static void main(String[] args) {
		System.out.println("Hello" + "World");
		System.out.println("Hello" + 1 + 2 + 3);
		System.out.println(1 + 2 + 3);
		System.out.println("Hello" + (1 + 2 + 3));
		System.out.println("Hello" + (1 + 2 + 3) + "World");
		System.out.println(1+2+3+"Hello");
		System.out.println((1+2+3)+"Hello"+1+2+3);
		System.out.println("Hello"+1.5+2+3);
		System.out.println("Hello"+'A'+2+3);
		int x = 1;
		int y = 2;
		System.out.println("Hello"+x+y);
		String str = null;
		System.out.println("Hello"+str+2+3); 
		System.out.println(1.5+2+3+"Hello");
		System.out.println(2+3+'A'+"Hello");
		System.out.println("Hello"+('A'+2+3));
		System.out.println(str+2+3+"Hello");
		



	}

}
