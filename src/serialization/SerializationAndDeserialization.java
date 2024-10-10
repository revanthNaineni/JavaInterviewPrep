package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	String engine;
	static int age=30;
	transient int no;
	
	public Car2(String engine, int no) {
		System.out.println("Constructor2 Called");
		this.engine = engine;
		this.no = no;
	}
	
	
}

class Car implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	String engine;
	int no;
	double price;
	static int age=30;
	
	public Car(String engine, int no) {
		System.out.println("Constructor Called");
		this.engine = engine;
		this.no = no;
	}
	
	
}

public class SerializationAndDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		
		  //Car car=new Car("2 stroke", 22);
		  
		  Car car=new Car("4 stroke", 33);
		  
		  
		  
		  
		  FileOutputStream fileOutputStream=new FileOutputStream("rev.txt");
		  ObjectOutputStream objectOutputStream=new
		  ObjectOutputStream(fileOutputStream); objectOutputStream.writeObject(car);
		  objectOutputStream.flush();
		 
				 
				 
			 
		 
		
		
			
					
					
				
				  FileInputStream fileInputStream = new FileInputStream("rev.txt");
				  ObjectInputStream inputStream = new ObjectInputStream(fileInputStream); Car
				  cardetails2 = (Car) inputStream.readObject();
				  System.out.println(cardetails2.engine); System.out.println(cardetails2.no);
				 
		 
		

	}

}
