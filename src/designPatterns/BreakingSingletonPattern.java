package designPatterns;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingSingletonPattern {

	public static void main(String[] args) throws Exception {
		
		//Using reflection
		
		  Constructor<Singletonpattern> declaredConstructor =
		  Singletonpattern.class.getDeclaredConstructor();
		  declaredConstructor.setAccessible(true); Singletonpattern newInstance =
		  declaredConstructor.newInstance();
		  System.out.println(newInstance.hashCode());
		 
		Singletonpattern singletonpattern=Singletonpattern.getInstance();
		System.out.println(singletonpattern.hashCode());
		
		//Using Serialization and Deserialization
		FileOutputStream fileOutputStream=new FileOutputStream("bsp.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(singletonpattern);
		
		FileInputStream fileInputStream=new FileInputStream("bsp.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		Singletonpattern singletonpattern2 = (Singletonpattern) objectInputStream.readObject();
		System.out.println(singletonpattern.hashCode());
		System.out.println(singletonpattern2.hashCode());
		
		//Using Cloneable
		Singletonpattern singletonpattern3 = (Singletonpattern) singletonpattern.clone();
		System.out.println(singletonpattern.hashCode());
		System.out.println(singletonpattern3.hashCode());
		
		
	}

}
