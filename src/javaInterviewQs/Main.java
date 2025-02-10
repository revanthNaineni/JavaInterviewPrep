package javaInterviewQs;
public class Main {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Type of num: " + ((Object) num).getClass().getName()); // Use boxing to treat it as an Object

        double value = 5.5;
        System.out.println("Type of value: " + ((Object) value).getClass().getName());
        
        String text = "Hello, World!";
        System.out.println("Type of text: " + text.getClass().getName());
        
        Integer number = 123;
        System.out.println("Type of number: " + number.getClass().getName());
        
        int num1 = 10;
        System.out.println("Type of num: " + ((Object) num).getClass().getSimpleName()); // Use boxing to treat it as an Object

        double value1 = 5.5;
        System.out.println("Type of value: " + ((Object) value).getClass().getSimpleName());
        
        String text1 = "Hello, World!";
        System.out.println("Type of text: " + text.getClass().getSimpleName());
        
        Integer number1 = 123;
        System.out.println("Type of number: " + number.getClass().getSimpleName());
    }
}
