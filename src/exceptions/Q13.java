package exceptions;

public class Q13 {
	public static int method() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("In finally block");
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
