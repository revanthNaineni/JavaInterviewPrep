package programming;

import java.util.Comparator;
import java.util.List;

class Course {
	private String name;
	private String catgegory;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String catgegory, int reviewScore, int noOfStudents) {
		this.name = name;
		this.catgegory = catgegory;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatgegory() {
		return catgegory;
	}

	public void setCatgegory(String catgegory) {
		this.catgegory = catgegory;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", catgegory=" + catgegory + ", reviewScore=" + reviewScore
				+ ", noOfStudents=" + noOfStudents + "]";
	}
}

public class FP05CustomClass {

	

	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring Boot", "Framework", 99, 100000),
				new Course("Spring MVC", "Framework", 90, 90000),
				new Course("Microservices", "Microservices", 98, 95000),
				new Course("API", "Framework", 95, 91000),
				new Course("Docker", "Cloud", 94, 100000),
				new Course("Kubernetes", "Cloud", 99, 80000));

		System.out.println(courses.stream().toString());

		System.out.println(courses.stream().noneMatch(course -> course.getReviewScore() < 90));

		System.out.println(courses.stream().anyMatch(course -> course.getReviewScore() >= 90));
	}

}
