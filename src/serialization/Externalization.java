package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Employee implements Externalizable{
	
	int empId;
	int age;
	String empName;
	String  company;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, int age, String empName, String company) {
		this.empId = empId;
		this.age = age;
		this.empName = empName;
		this.company = company;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(empId);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
       empId=in.readInt();	
       //age=in.readInt();
	}
	
	
	
}

public class Externalization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		  Employee employee=new Employee(22, 26, "Revanth", "Accenture");
		  FileOutputStream fileOutputStream=new FileOutputStream("employee.txt");
		  ObjectOutputStream objectOutputStream=new
		  ObjectOutputStream(fileOutputStream);
		  objectOutputStream.writeObject(employee);
		 
		 
		
		
		
		  FileInputStream fileInputStream=new FileInputStream("employee.txt");
		  ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		  Employee employee2=(Employee) inputStream.readObject();
		  
		  System.out.println(employee2.age+" : "+employee2.company+" : "+employee2.
		  empId+" : "+employee2.empName);
		 
		 
		

	}

}
