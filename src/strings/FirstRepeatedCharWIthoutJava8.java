package strings;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class FirstRepeatedCharWIthoutJava8 {

	public static void main(String[] args)  {
		
		  String str="Revanth Nayineni";
		  
		  //First Way
		  LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character,
		  Integer>();
		  
		  for (int i = 0; i < str.length(); i++) {
		  
		  map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1); 
		  
		  if(map.get(str.charAt(i))==2) {
			  System.out.println(str.charAt(i));
			  break;
		  }
		  }
		  
		  
		 //2nd Way
		HashSet<Character> set=new HashSet<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if(set.contains(str.charAt(i))) {
				System.out.println(str.charAt(i));
				break;
			}
			
			set.add(str.charAt(i));
		}
		
		
		
	}

}
