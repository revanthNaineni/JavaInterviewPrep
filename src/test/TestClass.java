package test;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Address{
	String houseNo;
	
	

	public Address(String houseNo) {
		super();
		this.houseNo = houseNo;
	}



	public String getHouseNo() {
		return houseNo;
	}



	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}



	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + "]";
	}
	
	
}

class Employee implements Cloneable{
    private int id;
    private String name;
    private double salary;
    private String department;
    private Address address;
    
    

    // Constructor
    public Employee(int id, String name, double salary, String department, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.address=address;
    }
    
    

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", address=" + address + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	

    
    
}

public class TestClass {
	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("Apple", 3);
		map.put("Banana", 1);
		map.put("Cherry", 5);
		map.put("Date", 2);
		
		LinkedHashMap<String, Integer> collect = map.entrySet().stream()
		.sorted(Entry.comparingByValue())
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(oldValue, newValue) -> oldValue, 
                LinkedHashMap::new));
		
		System.out.println(collect);
	}
}
	
	
	
	
	
