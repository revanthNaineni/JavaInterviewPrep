package capgeminiInterview;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given list of Students. Calculate sum of marks and find the top 3 students
class Student1 {
    private String name;
    private int rollNo;
    private int mathsMarks;
    private int scienceMarks;
    private int physicsMarks;

    public Student1(String name, int rollNo, int mathsMarks, int scienceMarks, int physicsMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.mathsMarks = mathsMarks;
        this.scienceMarks = scienceMarks;
        this.physicsMarks = physicsMarks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }
    
    public int getTotalMarks() {
    	return mathsMarks+scienceMarks+physicsMarks;
    }
}

public class FindTop3StudentsBasedonTotalSubjectMarks {
	
	public static void main(String[] args) {
		
	List<Student1> students = List.of(
            new Student1("Alice", 1, 85, 90, 80),
            new Student1("Bob", 2, 92, 88, 75),
            new Student1("Charlie", 3, 78, 85, 90),
            new Student1("David", 4, 95, 82, 88),
            new Student1("Eve", 5, 88, 95, 90)
    );

    // Find top 3 students based on the sum of marks in all subjects
    List<String> top3Students = students.stream()
            .sorted(Comparator.comparingInt((Student1 s) ->
                    s.getMathsMarks() + s.getScienceMarks() + s.getPhysicsMarks()).reversed())
            .limit(3)
            .map(s->s.getName())
            .collect(Collectors.toList());
    
    List<String> top3Students2 = students.stream()
            .sorted(Comparator.comparingInt(Student1::getTotalMarks).reversed())
            .limit(3)
            .map(s->s.getName())
            .collect(Collectors.toList());
    
    System.out.println(top3Students2);
	}
}
