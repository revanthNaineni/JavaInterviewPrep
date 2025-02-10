package cloning;

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

public class ShallowCopy {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address=new Address("1-23/1");
		Employee employee=new Employee(1, "Revanth", 1800000, "home", address);
		
		Employee employee2=(Employee) employee.clone();
		
		System.out.println(employee2);
		employee2.getAddress().setHouseNo("1-22/2");
		employee2.setName("Dembele");	
		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(address);
	}
}
	
	
	
	
	
