package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxNoByDeletingOneDigit {

	public static void main(String[] args) {

		int n = 1523;
		
		String str = Integer.toString(n);
		
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			
			String str2=str.replace(String.valueOf(str.charAt(i)), "");
			list.add(Integer.parseInt(str2));
			
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(list.size()-1));
		
		
		
		
		

		

		
		 

	}

}
