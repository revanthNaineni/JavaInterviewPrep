package exceptions;
public class ExceptionInConstructor {
    public ExceptionInConstructor() {
        // Simulate an error condition
        if (someCondition()) {
            throw new IllegalArgumentException("Invalid input");
        }
    }
    
    public ExceptionInConstructor(String test) {
    	System.out.println(test);
    }

    private boolean someCondition() {
        // Some logic to determine if the condition is true
        return true;
    }

    public static void main(String[] args) {
        try {
        	ExceptionInConstructor obj = new ExceptionInConstructor(); // Attempt to create an object
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
