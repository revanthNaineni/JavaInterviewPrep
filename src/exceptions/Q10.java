package exceptions;

public class Q10 {
	public static int method() {
        try {
            throw new RuntimeException("Exception in try");
        } finally {
            return 5;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
