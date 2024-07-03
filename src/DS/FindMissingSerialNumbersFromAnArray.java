package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingSerialNumbersFromAnArray {

	public static void main(String[] args) {
		
		int arr[] = {6,2,3,8,11,18};
		 Arrays.sort(arr);
		 List<Integer> list=new ArrayList<Integer>();
		 for (int i = 0; i < arr.length; i++) {
			 list.add(arr[i]);
		 }
		// System.out.println(list);
		 
		 for (int i = 0; i < list.size()-1; i++) {
			if(list.get(i)+1!=list.get(i+1)) {
				list.add(i+1, list.get(i)+1);
				System.out.println(list.get(i)+1);
			}
		}
		 
		 //System.out.println(list);
		
	}

}
