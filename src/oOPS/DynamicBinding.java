package oOPS;
class Animals {

    void eat() {

        System.out.println("animal is eating...");

    }

}

 

class Dogs extends Animals {

    void eat() {

        System.out.println("dog is eating...");

    }
    
    void drink() {
    	System.out.println("dog is drinking");
    }
}
public class DynamicBinding {
	public static void main(String[] args) {
		 Animals a = new Dogs();

	        a.eat();

	}

}
