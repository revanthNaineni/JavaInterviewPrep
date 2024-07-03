package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Notes{
	int id;
	String name;
	int number;
	public Notes(int id, String name, int number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	
}
//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
public class QStream17 {

	public static void main(String[] args) {
		List<Notes> noteLst = new ArrayList<>();
	    noteLst.add(new Notes(1, "note1", 11));
	    noteLst.add(new Notes(2, "note2", 22));
	    noteLst.add(new Notes(3, "note3", 33));
	    noteLst.add(new Notes(4, "note4", 44));
	    noteLst.add(new Notes(5, "note5", 55));

	    noteLst.add(new Notes(6, "note4", 66));
	    
	    Map<Integer, Long> collect = noteLst.stream()
	    .collect(Collectors.groupingBy(s->s.getId(),Collectors.counting()));
	    System.out.println(collect);

	}

}
