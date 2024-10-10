package exceptions;

public class Q14 {
	public static int method() {
        try {
            return 1;
        } finally {
            throw new RuntimeException("Exception in finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
