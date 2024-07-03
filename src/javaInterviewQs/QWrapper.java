package javaInterviewQs;

public class QWrapper {
 int b;
 static int e;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QWrapper qWrapper=new QWrapper();
		int d;
		//Integer integer=Integer.valueOf(22);
		int a=23;
		Integer integer=Integer.valueOf(a);//converting int to integer explicitly
		Integer integer2=a;//autoboxing, now compiler will write Integer.valueOf(a) internally 
		int num=integer2.intValue();//converting integer to int explicitly
		int num2=integer2;//unboxing, now compiler will write a.intValue() internally 
		System.out.println(a);
		System.out.println(integer);
		System.out.println(integer2);
		System.out.println(num);
		System.out.println(num2);
		System.out.println(qWrapper.b);
		System.out.println(e);
		//System.out.println(d);
	}

}
