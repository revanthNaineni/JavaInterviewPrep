package strings;

import java.util.Arrays;

public class QPalindrome {

	public static void main(String[] args) {
		
		String s1="Rotator";
		
		/*
		 * StringBuilder builder=new StringBuilder(s1); StringBuilder
		 * builder2=builder.reverse();
		 * 
		 * String s2=builder.toString(); String s3=builder2.toString();
		 * 
		 * if (s2.equals(s3)) { System.out.println("Its a palindrome"); }else{
		 * System.out.println("Its not a palindrome"); }
		 */
		
		if (isPalindrome(s1)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

	}

	private static boolean isPalindrome(String s1) {
		for (int i = 0; i < s1.length()/2; i++) {
			if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)) {
				return false;
				
			}
			
		}
		return true;
	}

}
