package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
public class QStream15 {

	public static void main(String[] args) {
		Integer arr []= {1,2,3,4};
		
        System.out.println(extracted(arr));
	}

	private static boolean extracted(Integer[] arr) {
		List<Integer> collect = Arrays.stream(arr)
		.distinct()
		.collect(Collectors.toList());
		
		if(arr.length==collect.size()) {
			return false;
		}else {
			return true;
		}
	}

}
