package javaInterviewQs;

public class QCasting {

	public static void main(String[] args) {
		//Implicit Casting
		
		int value=100;
		long v1=value;//Implicit Casting
		float f=100;
		System.out.println(value);
		System.out.println(v1);
		System.out.println(f);
		
		System.out.println("Explicit Casting");
		
		long l1=220000000000000L;
		int i1=(int) l1;//Explicit Casting
		
		int i2=(int) 35.5;//Explicit Casting
		
		System.out.println(l1);
		System.out.println(i1);
		System.out.println(i2);
		
		int a=128;
		byte b=(byte) a;
		System.out.println(b);
		
		long maxValue = Long.MAX_VALUE;
		System.out.println(maxValue);
		
		long minValue = Long.MIN_VALUE;
		System.out.println(minValue);

	}

}
