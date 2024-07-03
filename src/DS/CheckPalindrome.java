package DS;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		String inputString="aabababbbaa";
		
		System.out.println(checkPalindrome(inputString));
		

	}

	private static boolean checkPalindrome(String inputString) {
		int first=0;
		int last=inputString.length()-1;
		
		while (first!=last) {
			if(inputString.charAt(first)==inputString.charAt(last)) {
				first++;
				last--;
			}else {
				return false;
			}
			
		}
		return true;
	}
	
}
