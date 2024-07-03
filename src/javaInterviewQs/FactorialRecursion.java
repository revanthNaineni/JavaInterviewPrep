package javaInterviewQs;

public class FactorialRecursion {

	public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case: factorial of n is n times the factorial of n-1
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change this to calculate the factorial of any number
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
