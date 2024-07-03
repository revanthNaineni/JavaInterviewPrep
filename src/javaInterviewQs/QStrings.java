package javaInterviewQs;

public class QStrings {
	int i;
	boolean b;
	String test;
	public static void main(String[] args) {
		
		String test2;
		String s1="Revanth";
		s1.concat("Naineni");
		System.out.println(s1);
		s1=s1.concat("Naineni");
		System.out.println(s1);
		
		String st1="test";
		String st2="test";
		System.out.println(st1 == st2);
		
		String str1 = new String("Scaler by InterviewBit");  //Line1  
		String str2 = new String("Scaler by InterviewBit"); //Line2  
		System.out.println(str1 == str2);
		
		String str3 = new String("Scaler by InterviewBit").intern();  //Line1  
		String str4 = new String("Scaler by InterviewBit").intern(); //Line2  
		System.out.println(str3 == str4);
		
		String test="Revanth";
		System.out.println(test.subSequence(1,3));
		
		String str = "     Scaler by InterviewBit   ";
		System.out.println(str.trim());
		QStrings qStrings= new QStrings();
		System.out.println(qStrings.b);
		System.out.println(qStrings.i);
		System.out.println(qStrings.test);
		//System.out.println(test2);
		
		String o1="test";
		String o2="test";
		String o3="12";
		
		System.out.println(o1.equals(o2));
		System.out.println(o1.equalsIgnoreCase(o2));
		System.out.println(o1.compareTo(str));
		
		Integer n1=Integer.parseInt(o3);
		System.out.println(n1);
		String string1=n1.toString();
		System.out.println(string1);
		
		String rev="Ousmane Dembele";
		System.out.println(rev.substring(7, 12));
				}

}
