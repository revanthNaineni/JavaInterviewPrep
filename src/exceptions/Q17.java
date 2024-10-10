package exceptions;

public class Q17 {
	public static int method() {
        try {
            throw new RuntimeException("Exception in try");
        } catch (Exception e) {
            throw new IllegalArgumentException("Exception in catch");
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
