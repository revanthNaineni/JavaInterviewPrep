package oOPS;

public class methodOverloading {
	 
	public static int add(int a,int b) {
		return a+b;
	}
	
	private static double add(double a ,int b) {
		return a+b;
	}
	
	//Return type of the method doesn't matters in method overloading

	public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2.5,3));
	}

}
