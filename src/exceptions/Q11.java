package exceptions;

public class Q11 {
	public static int method() {
        try {
            throw new Exception("Error occurred");
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
