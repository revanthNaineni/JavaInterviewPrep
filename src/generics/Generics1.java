package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Human{
	int age;
	String name;
	String number;
	
	public Human() {
		
	}
	

	public Human(int age, String name, String number) {
		this.age = age;
		this.name = name;
		this.number = number;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", name=" + name + ", number=" + number + "]";
	}

	
	
}

class Doctor extends Human implements Comparable<Doctor>,Comparator<Doctor>{

	int age;
	String name;
	String number;
	
	public Doctor() {
		
	}
	
	public Doctor(int age, String name, String number) {
		this.age = age;
		this.name = name;
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Doctor [age=" + age + ", name=" + name + ", number=" + number + "]";
	}
	
	 @Override
		public int compareTo(Doctor o) {
			// return this.name.compareTo(o.name);
			if (this.age < o.age) {
				return +1;
			} else if (this.age > o.age) {
				return -1;
			} else {
				return 0; 
			}
		}

	@Override
	public int compare(Doctor o1, Doctor o2) {
		/*
		 * if (o1.age<o2.age) { return -1; } else if (o1.age>o2.age) { return 1; } else
		 * { return 0; }
		 */
		return o1.name.compareTo(o2.name);
	}
	
	
	
}

public class Generics1 {

	public static <T> void iterate(List<T> list) {
		for (T string : list) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
		Doctor doctor=new Doctor(30, "qTest1", "99990n");
		Doctor doctor1=new Doctor(24, "bTest2", "999910");
		Doctor doctor2=new Doctor(116, "zTest3", "99992c");
		Doctor doctor3=new Doctor(-22, "eTest4", "99993l");
		Doctor doctor4=new Doctor(11, "pTest5", "99994f");
		
		ArrayList<Doctor> doctors= new ArrayList<>();
		doctors.add(doctor);
		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
		doctors.add(doctor4);
		
		Generics1.iterate(doctors);
		
		//Collections.sort(doctors);
		Collections.sort(doctors,new Doctor());
		
		System.out.println("After sorting.....");
		
		Generics1.iterate(doctors);
	}

	

}
