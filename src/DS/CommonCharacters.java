package DS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonCharacters {

	public static void main(String[] args) {
		
		String s1="aabcc";
		String s2="adcaa";
		int count=0;
		
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		List<Character> list1=new ArrayList<Character>();
		List<Character> list2=new ArrayList<Character>();
		for (char c : charArray1) {
			list1.add(c);
		}
		
		for (char c : charArray2) {
			list2.add(c);
		}
		
		for (int i = 0; i < list1.size(); i++) {
			
			for (int j = 0; j < list2.size(); j++) {
				if(list1.get(i)==list2.get(j)) {
					count++;
					list2.remove(j);
					break;
				}
				
			}
			
		}
		
		System.out.println(count);

	}

}
