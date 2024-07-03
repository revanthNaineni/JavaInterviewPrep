package javaInterviewQs;

public class Instances3 {
	public static int count = 0;

	public Instances3() {
		count++;
		if (count >= 3) {
			throw new NullPointerException("Three object cant be created");
		}
		System.out.println("Object created");
	}

	public static void main(String[] args) {
		Instances3 instances3 = new Instances3();
		Instances3 instances4 = new Instances3();
		Instances3 instances32 = new Instances3();

	}

}
