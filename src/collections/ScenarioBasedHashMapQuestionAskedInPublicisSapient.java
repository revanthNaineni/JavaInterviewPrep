package collections;
import java.util.HashMap;
import java.util.Objects;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    // Constructor
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class

        Employee employee = (Employee) obj;
        return id == employee.id &&
               Double.compare(employee.salary, salary) == 0 &&
               name.equals(employee.name) &&
               department.equals(employee.department);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, department);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + ", department='" + department + "'}";
    }
}

public class ScenarioBasedHashMapQuestionAskedInPublicisSapient {
    public static void main(String[] args) {
        Employee e1 = new Employee(111, "John", 25000.0, "HR");
        Employee e2 = new Employee(122, "Bob", 13500.0, "Sales");
        Employee e3 = new Employee(111, "John", 25000.0, "HR");

        HashMap<Employee, String> employeeMap = new HashMap<>();
        employeeMap.put(e1, "Employee 1");
        employeeMap.put(e2, "Employee 2");
        employeeMap.put(e3, "Employee 3"); // Duplicate of e1

        // Print the map
        System.out.println("Employee Map: " + employeeMap);
        System.out.println("Map size: " + employeeMap.size()); // Should be 2
    }
}
