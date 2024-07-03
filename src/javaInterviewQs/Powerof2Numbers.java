package javaInterviewQs;

import java.util.Scanner;

public class Powerof2Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int prod=1;
		/*
		 * for (int i = 1; i <= b; i++) { prod=prod*a;
		 * 
		 * }
		 */
		prod=(int) Math.pow(a, b);
		System.out.println(prod);
	}

}
