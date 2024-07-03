package oOPS;

public class AccessModifiers{
	protected static int age =33;
  public AccessModifiers() {
		System.out.println("Modifier1 cons called");
	}
  public AccessModifiers(int a){
		System.out.println(a);
	}
}

/*
 * class Modifier2 extends Modifier1{
 * 
 * Modifier2() { // TODO Auto-generated constructor stub super(20); }
 * 
 * }
 * 
 * public class AccessModifiers {
 * 
 * public static void main(String[] args) { // Modifier1 modifier1=new
 * Modifier1(); System.out.println(Modifier1.age); }
 * 
 * }
 */
