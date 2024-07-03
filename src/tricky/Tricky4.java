package tricky;

public class Tricky4 {

	public static void main(String[] args) {
		//public int a=10;    //Compilation error
		//private int b=10;   //Compilation error
		//protected int c=10; //Compilation error
		int d=10;           //No error
		
		//static int e=10;     //Compilation error
		//transient int f=10;  //Compilation error
		//volatile int g=10;   //Compilation error
		final int h=20;      //No error
	}

}
