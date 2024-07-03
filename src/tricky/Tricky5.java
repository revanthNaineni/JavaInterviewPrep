package tricky;

public class Tricky5 {

	public static void main(String[] args) {
		char[] ca ={0x4e, \u004e, 78};  
		System.out.println((ca[0] == ca[1]) + " "+ (ca[0] == ca[2]));  
	}

}

//Compilation error. The Unicode declaration must be enclosed in single quotes: '\u004e'.
 	