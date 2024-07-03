package javaInterviewQs;

import java.io.Serializable;

public class Student implements Cloneable,Serializable {
	
	public String name;
	public String village;
	public int age=23;
	
	public Student() {
		System.out.println("constructor called");
	}
	
	public Student(int test) {
		System.out.println("constructor called");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
