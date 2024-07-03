package collections;

import java.util.ArrayList;
import java.util.List;

public class QWildCard {
	
	
	public static void getList(List<?> list) {
		//list.add(null);
		//list.add(2);
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	public static void getAge(List<? extends Number> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	public static void getHeight(List<? super Integer> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	//Generic method
	 public static <T> void printArray(T[] array) {
	        for (T element : array) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }
	
	
	

	public static void main(String[] args) {
    List<Integer> arrayList=List.of(1,2,3);
    List<String> strings=List.of("hello","test","Dembele");
    getList(arrayList);
    getList(strings);
    getAge(arrayList);
    getHeight(arrayList);
	}

}
