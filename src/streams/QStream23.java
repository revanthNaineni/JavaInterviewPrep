package streams;

import java.util.List;

public class QStream23 {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6);
		
		list.stream().peek(System.out::println).map(s->s*s).reduce((a,b)->a+b);
	}

}
