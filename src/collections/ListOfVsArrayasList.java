package collections;

import java.util.Arrays;
import java.util.List;

public class ListOfVsArrayasList {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6,7);
		
		//list.add(8);
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
		//list2.add(7);
		list2.set(0, 0);
		
		String[] array = {"A", "B", "C"};
		List<String> list3 = Arrays.asList(array);
		array[0] = "Z"; 
		
		System.out.println(list3);
	}

}
