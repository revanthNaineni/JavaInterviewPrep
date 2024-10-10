package exceptions;

public class Q15 {
	public static void method() {
        try {
            throw new IllegalArgumentException("Exception in try");
        } finally {
            throw new RuntimeException("Exception in finally");
        }
    }

    public static void main(String[] args) {
        method();
    }
}
