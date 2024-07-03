package oOPS;

import java.util.function.Predicate;

class Anonymous {
	void getAge() {
		System.out.println("23");
	}

	void getHeight() {
		System.out.println("6.2");
	}
	/*
	 * void getSpeed() { System.out.println("36kmph"); }
	 */
}

/*
 * class Anonymous2{ void getAge() { System.out.println("34"); } }
 */

public class AnonymousClass {

	/*
	 * public static void main(String[] args) { Anonymous2 anonymous2=new
	 * Anonymous2(); anonymous2.getAge(); }
	 */
	public static void main(String[] args) {

		/*
		 * Anonymous1 anonymous1=new Anonymous1() { void getAge() {
		 * System.out.println("34"); }
		 * 
		 * 
		 * void getSpeed() { System.out.println("36kmph"); }
		 * 
		 * 
		 * 
		 * };
		 */
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		//anonymous1.getAge();
		// anonymous1.getSpeed();
		//anonymous1.getHeight();
		System.out.println(predicate.test("hello"));

	}

}
