package capgeminiInterview;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given list of Students. Print the name of top 3 students based on marks
class Student {
	private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}
public class FindTop3StudentsBasedonMarks {
	
	public static void main(String[] args) {
		
	
	List<Student> students = List.of(
            new Student("Alice", 85),
            new Student("Bob", 92),
            new Student("Charlie", 78),
            new Student("David", 95),
            new Student("Eve", 88)
    );
	
	List<String> collect = students.stream()
	.sorted(Comparator.comparingInt(Student::getMarks).reversed())
	.map(s->s.getName())
	.limit(3)
	.collect(Collectors.toList());
	
	System.out.println(collect);
	
	}

}
