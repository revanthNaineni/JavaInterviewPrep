package javaInterviewQs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class QObject {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException,
			IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException, ClassNotFoundException {

		// using new keyword

		Student s1 = new Student();
		System.out.println(s1);
		s1.age = 33;
		System.out.println(s1.age);
		System.out.println("using newinstance()");

		Student s2 = Student.class.newInstance();
		//Class class1 = Class.forName("Student");
		//Student newInstance = (Student)class1.newInstance();
		
		System.out.println(s2);
		s2.age = 23;
		System.out.println(s2.age);

		System.out.println("using Constructor newinstance()");
		Constructor<Student> cons = Student.class.getConstructor();
		Student s3 = cons.newInstance();
		System.out.println(s3);
		s3.age = 43;
		System.out.println(s3.age);

		System.out.println("using clone()");

		Student s4 = (Student) s3.clone();
		System.out.println(s4);
		s4.age = 53;
		System.out.println(s4.age);

		
		/*
		 * FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
		 * ObjectOutputStream objectOutputStream = new
		 * ObjectOutputStream(fileOutputStream); Student s = new Student();
		 * objectOutputStream.writeObject(s);
		 */
		 

		FileInputStream fileInputStream = new FileInputStream("text.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Student s5 = (Student) objectInputStream.readObject();
		System.out.println(s5);

	}

}
