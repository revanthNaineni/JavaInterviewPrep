package streamsSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Suppose you have a list of Student objects with name and examScores fields where examScores is a list of integers representing scores in various exams. Write code to sort this list based on the average exam score in descending order using Java streams.

class Student {
	private String name;
	private List<Integer> examScores;

	public Student(String name, List<Integer> examScores) {
		this.name = name;
		this.examScores = examScores;
	}

	public String getName() {
		return name;
	}

	public List<Integer> getExamScores() {
		return examScores;
	}

	public double getAverageExamScore() {
		return examScores.stream().mapToInt(Integer::intValue).average().orElse(0.0);
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", examScores=" + examScores + '}';
	}
}

public class Sorting4 {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", List.of(85, 90, 80)));
        students.add(new Student("Bob", List.of(92, 88, 75)));
        students.add(new Student("Charlie", List.of(78, 85, 90)));
        students.add(new Student("David", List.of(95, 82, 88)));
        students.add(new Student("Eve", List.of(88, 95, 90)));
        
        List<Student> sortedStudents = students.stream()
                .sorted((s1, s2) -> {
                    double avgScore1 = s1.getExamScores().stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
                    double avgScore2 = s2.getExamScores().stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
                    return Double.compare(avgScore2, avgScore1); // Sort in descending order
                })
                .collect(Collectors.toList());

        // Print the sorted list of students
        sortedStudents.forEach(System.out::println);
        
	}

}
