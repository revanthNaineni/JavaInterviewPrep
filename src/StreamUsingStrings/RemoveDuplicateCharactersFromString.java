package StreamUsingStrings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		String str="Dembele";
		
		Set<Character> set=new LinkedHashSet<Character>();
		
		Character[] array = str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(s->s,Collectors.counting()))
		.entrySet().stream()
		.filter(s->s.getValue()<2)
		.map(Map.Entry::getKey)
		.toArray(Character []::new);
		
		
		char arr []=new char[array.length];
		int i=0;
		for (Character character : array) {
			arr[i]=character;
			i++;
		}
		String str2=new String(arr);
		System.out.println(str2);
	}

}
