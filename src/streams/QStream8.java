package streams;

import java.util.List;

//Given a list of integers, use the Stream API to find the sum of all even numbers in the list.
public class QStream8 {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		int sum = list.stream()
		.filter(p->p%2==0)
		.mapToInt(p->p)
		.sum();
		
		System.out.println(sum);
	}

}
