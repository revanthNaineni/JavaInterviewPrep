package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		Integer arr[]= {1,4,6,8,4,6,9,3,1,9};
		HashSet<Integer> hashSet=new HashSet<Integer>();
		
		Integer[] array = Arrays.stream(arr)
		.filter(n->!hashSet.add(n))
		.toArray(Integer[]::new);
		
		for (Integer integer : array) {
			System.out.println(integer);
		}
	}

}
