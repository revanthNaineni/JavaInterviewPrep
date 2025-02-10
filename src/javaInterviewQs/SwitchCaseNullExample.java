package javaInterviewQs;
public class SwitchCaseNullExample {
    public static void main(String[] args) {
        String value = null;

        switch (value) {
            case null -> System.out.println("The value is null");
            case "A" -> System.out.println("The value is A");
            case "B" -> System.out.println("The value is B");
            default -> System.out.println("The value is something else");
        }
    }
}
