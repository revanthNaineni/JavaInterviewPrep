package exceptions;
public class ExceptionThrownInFinallyandTry {
    public static void main(String[] args) {
        try {
            tryBlock();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable throwable : suppressed) {
                System.out.println("Suppressed: " + throwable.getMessage());
            }
        }
    }

    public static void tryBlock() throws Exception {
        try {
            throw new NullPointerException("Exception from try block");
        } finally {
            throw new RuntimeException("Exception from finally block");
        }
    }
}
