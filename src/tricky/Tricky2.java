package tricky;

public class Tricky2 {

	public static void main(String[] args) {
		int i=20+ +9- -12+ +4- -13+ +19;  
		System.out.println(i);  
	}

}

/*
 * In the program, the operators are just for puzzle someone. The operators are
 * neither pre or post increment. The statement can be written and solved as
 * follows:
 * 
 * int i=20+ (+9)- (-12)+ (+4)- (-13)+ (+19);
 * 
 * i=20+9+12+4+13+19
 * 
 * i=77
 */