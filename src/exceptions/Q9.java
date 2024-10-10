package exceptions;

public class Q9 {
	public static int method() {
        try {
            System.out.println("In try block");
            return 1;
        } catch (Exception e) {
            System.out.println("In catch block");
            return 2;
        } finally {
            System.out.println("In finally block");
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
