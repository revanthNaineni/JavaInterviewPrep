package streams;
//Given a list of strings, write a Java program using the Stream API to concatenate all the strings into a single comma-separated string.
import java.util.List;
import java.util.Optional;

public class QStream10 {

	public static void main(String[] args) {
		List<String> list=List.of("revanth","Reus","Messi","Dembele","Ben","Tendulkar");
		Optional<String> reduce = list.stream()
		.reduce((a,b)->a+","+b);
		
		if(reduce.isPresent()) {
			System.out.println(reduce.get());
		}
	}

}
