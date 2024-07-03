package javaInterviewQs;

public class ReverseAString {

	public static void main(String[] args) {
		String str="Revanth";
		char arr[]=new char[str.length()];
		for (int i = str.length()-1; i>=0 ; i--) {
			arr[str.length()-1-i]=str.charAt(i);
		}
		String string=new String(arr);
		System.out.println(string);

}
}
