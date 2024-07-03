package javaInterviewQs;

public class GCDOfTwoNumbers {
	public static void main(String[] args) {

		//GCD (a, b) = (a × b)/ LCM (a, b).
		//LCM: = (a x b) / GCD
	    // find GCD between n1 and n2
	    int n1 = 81, n2 = 153;
	    
	    // initially set to gcd
	    int gcd = 1;
	    
	    int max = (n1 > n2) ? n1 : n2;

	    for (int i = 1; i <= max; ++i) {

	      // check if i perfectly divides both n1 and n2
	      if (n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }

	    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
	    int lcm=(n1*n2)/gcd;
	    System.out.println(lcm);
	  }

}
