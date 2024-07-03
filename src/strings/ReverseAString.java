package strings;

public class ReverseAString {

	public static void main(String[] args) {
		String name="revanth";
		char arr [] =new char[name.length()];
		int count=0;
		for (int i = name.length()-1; i>=0; i--) {
			arr[count]=name.charAt(i);
			count++;
			
		}
		
		String str=new String(arr);
		System.out.println(str);
}

}
