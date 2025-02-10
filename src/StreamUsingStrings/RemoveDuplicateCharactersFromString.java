package StreamUsingStrings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharactersFromString {
	private static RemoveDuplicateCharactersFromString charactersFromString;
	
	private RemoveDuplicateCharactersFromString() {
		
	}
	
	public static RemoveDuplicateCharactersFromString getInstance() {
		if(charactersFromString==null) {
			synchronized (RemoveDuplicateCharactersFromString.class) {
				if(charactersFromString==null) {
					charactersFromString=new RemoveDuplicateCharactersFromString();
				}
			}
				
		}
		return charactersFromString;
	}
}
