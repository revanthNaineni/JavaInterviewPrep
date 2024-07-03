package javaInterviewQs;
public class EuclidGCD {

  // A method to find the GCD of two numbers using the Euclidean algorithm
  public static int gcd (int a, int b) {
	 // main(new String[]{"arg1", "arg2"});
    // If b is zero, a is the GCD
    if (b == 0) {
      return a;
    }
    /// call the gcd() method recursively by 
    // replacing a with b and b with 
    // modulus(a,b) as long as b != 0 
    
    else {
      return gcd (b, a % b);
    }
    
  }
  

  // A main method to test the gcd method
  public static void main (String [] args) {
    // Declare and initialize two numbers
    int a = 153;
    int b = 81;
    // Find and print their GCD
    int gcd = gcd (a, b);
    System.out.println ("The GCD of " + a + " and " + b + " is " + gcd);
  }
}
