package designPatterns;

import java.io.Serializable;

public class Singletonpattern implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile Singletonpattern singletonpattern;

	
	//To avoid breaking Singleton from Reflection
	private Singletonpattern() throws Exception {
		if(singletonpattern!=null) {
			throw new RuntimeException("Instance already created. Use getInstance()");
		}
	}

	public static Singletonpattern getInstance() throws Exception {
		if (singletonpattern == null) {
            synchronized (Singletonpattern.class) {
                if (singletonpattern == null) {
                	singletonpattern = new Singletonpattern();
                }
            }
        }

		return singletonpattern;
	}
	
	//To avoid breaking Singleton while Cloning
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonpattern;
    }
	
	//To avoid breaking Singleton while Deserialization
	protected Object readResolve() {
		return singletonpattern;
	}	 

}

 class Main {
    public static void main(String[] args) throws Exception {
        // Get the instance of Singleton
        Singletonpattern singletonInstance1 = Singletonpattern.getInstance();
        Singletonpattern singletonInstance2 = Singletonpattern.getInstance();
        
        System.out.println(singletonInstance1);
        System.out.println(singletonInstance2);

        // Check if both instances are the same
        System.out.println(singletonInstance1 == singletonInstance2); // Output: true
    }
}
