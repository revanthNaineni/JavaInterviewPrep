package oOPS;

class Sports{
	public void getSports() {
		System.out.println("Sports Super class");
	}
}

class Cricket extends Sports{
	public void getSports() {
		System.out.println("Cricket sub class");
	}
	public void getAge() {
		System.out.println("Age is 33");
	}
}
public class QInheritance1 {

	public static void main(String[] args) {
		Sports sports=new Cricket();
		sports.getSports();
		//sports.getAge(); //Will not be accessible through sports reference
		
		Cricket cricket=new Cricket();
		cricket.getSports();
		cricket.getAge();

	}

}
