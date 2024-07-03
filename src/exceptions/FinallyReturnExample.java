package exceptions;
public class FinallyReturnExample {
    public static void main(String[] args) {
        System.out.println(testMethod());
    }

    public static int testMethod() {
        try {
            return 1;
        } finally {
            // This return statement overrides the return from the try block
            return 2;
        }
    }
}
