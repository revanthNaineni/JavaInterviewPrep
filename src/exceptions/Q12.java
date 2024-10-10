package exceptions;

public class Q12 {
	public static int method() {
        int value = 10;
        try {
            return value;
        } finally {
            value = 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
