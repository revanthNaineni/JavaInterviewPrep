package immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiableAndImmutableList {

	public static void main(String[] args) {
		//unmmodifiable
		
		List<String> originalList = new ArrayList<>();
        originalList.add("A");
        originalList.add("B");
        
        List<String> unmodifiableList = Collections.unmodifiableList(originalList);
        
        originalList.add("C");
        
        System.out.println(originalList);
        System.out.println(unmodifiableList);
        
        unmodifiableList.add("D");
	}

}
