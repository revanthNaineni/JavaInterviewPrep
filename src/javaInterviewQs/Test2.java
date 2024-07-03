package javaInterviewQs;

public class Test2 {
	
	static int i=0;
	public Test2() throws Exception {
		i++;
		if(i>2) {
			throw new Exception("Cant create more than 2 objects");
		}
		
	}

	public static void main(String[] args) throws Exception {
		/*
		 * int age=4; switch (age) { case 1: System.out.println("age is 1"); break; case
		 * 2: System.out.println("age is 2"); break; case 3:
		 * System.out.println("age is 3"); break;
		 * 
		 * 
		 * default: System.out.println("age is default"); break;
		 * 
		 * }
		 * 
		 * 
		 * String s1="The total%!!///()())("; String s2=s1.replaceAll(" ", "");
		 * System.out.println(s2.length());
		 */
		
		Test2 test1=new Test2();
		Test2 test2=new Test2();
		Test2 test3=new Test2();
		
	}

}
