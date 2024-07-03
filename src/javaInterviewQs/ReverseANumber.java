package javaInterviewQs;

public class ReverseANumber {

	public static void main(String[] args) {
		
		//1st way
		int n=12580;
		String str="";
		while (n!=0) {
			str=str+n%10;
			n=n/10;
			
		}
		
		int num=Integer.valueOf(str);
		System.out.println(num);
		
		//2nd way
		int n2=689;
		int revNo=0;
		while (n2!=0) {
			revNo=revNo*10+n2%10;
			n2=n2/10;
			
		}
		
		System.out.println(revNo);
		
		System.out.println(8521);
		
		
		
	}

}
