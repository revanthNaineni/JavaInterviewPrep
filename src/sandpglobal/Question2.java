package sandpglobal;

public class Question2 {
	public static void main(String[] args) {
	     someMethod("");
	}
	 
	public static void someMethod(String s) {
	try {
	throw new ArrayIndexOutOfBoundsException();
	} finally {
	throw new NullPointerException();
	//System.out.println("Revanth");
	}
	}

}


//if(list != null && list.size() >0)