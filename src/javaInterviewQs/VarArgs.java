package javaInterviewQs;

public class VarArgs {
	
	public void getLength(Integer...num) {
		System.out.println("length "+num.length);
	}
	
	public void getLength(int n1,int n2,int n3) {
		System.out.println(n1+n2+n3);
	}
	
	public void getSomething(int a,String...var) {
		String[] var2 = var;
		for (String string : var2) {
			System.out.println(a+" : "+string);
		}
	}

	public static void main(String...args) {
		VarArgs args2=new VarArgs();
		Integer arr[]= {20,05,88,911};
		args2.getLength(33,22,36);
		args2.getLength(arr);
		args2.getLength(1,2,3,4,5,6,7,8,9);
		args2.getSomething(10, "Dembele","Mbappe","Asensio");

	}

}
