package designPatterns;

public class Singletonpattern {
	private static Singletonpattern singletonpattern;

	private Singletonpattern() {

	}

	public static Singletonpattern getInstance() {
		if (singletonpattern == null) {
			singletonpattern = new Singletonpattern();
			System.out.println("New object is created");
		}else {
			System.out.println("Object is reused");
		}
		return singletonpattern;
	}

}

 class Main {
    public static void main(String[] args) {
        // Get the instance of Singleton
        Singletonpattern singletonInstance1 = Singletonpattern.getInstance();
        Singletonpattern singletonInstance2 = Singletonpattern.getInstance();
        
        System.out.println(singletonInstance1);
        System.out.println(singletonInstance2);

        // Check if both instances are the same
        System.out.println(singletonInstance1 == singletonInstance2); // Output: true
    }
}
