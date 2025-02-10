package hashcodeAndEquals;

import java.util.Objects;

class Employee{
	private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getter and Setter methods
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(obj == null) return false;
    	Employee employee=(Employee)obj;
    	 return this.id==employee.id &&
    			 Objects.equals(this.name, employee.name) &&
    			 Objects.equals(this.department, employee.department) &&
    			 this.salary==employee.salary;
    }
    
    @Override
    public int hashCode() {
    	return Objects.hash(id, name, department, salary);
    }
}

public class HashCodeAndEqualsOverriding {
	public static void main(String[] args) {
		Employee e1= new Employee(111, "John", "HR", 25000.0);
		Employee e2= new Employee(122, "Bob", "Sales",13500.0);
		Employee e3= new Employee(111, "John", "HR",25000.0);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));

	}

}
