package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSmallestPositiveIntegerTheProductOfWhoseDigitsIsEqualToGivenNo {

	public static void main(String[] args) {
		
		int num=29;
		int smallestPositiveInteger = findSmallestPositiveInteger(num);
		
		System.out.println(smallestPositiveInteger);

	}

	private static int findSmallestPositiveInteger(int num) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=100;i++) {
			for (int j = 1; j <=100; j++) {
				if(i*j==num) {
				//System.out.println(i+""+j);	
				list.add(Integer.parseInt(i+""+j));
				//break;
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		
		if(list.size()==0) {
			return -1;
		}
		
		return list.get(0);
	}

}
