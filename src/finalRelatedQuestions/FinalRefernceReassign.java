package finalRelatedQuestions;

import java.util.ArrayList;
import java.util.List;

public class FinalRefernceReassign {
	 public static void main(String[] args) {
	        final int x = 10;
	        // Attempting to reassign a different value to the final variable 'x'
	        // This will result in a compilation error
	        // x = 20; // Error: cannot assign a value to final variable 'x'

	        final StringBuilder sb = new StringBuilder("Hello");
	        // Attempting to reassign a different object to the final reference variable 'sb'
	        // This will result in a compilation error
	        //sb = new StringBuilder("World"); // Error: cannot assign a value to final variable 'sb'

	        // However, the content of the final reference variable can be modified
	        sb.append(" World");
	        System.out.println(sb); // Output: Hello World
	        final List<String> list=new ArrayList<String>();
	        list.add("23");
	        list.add("25");
	        list.add("30");
	        
	        System.out.println(list);
	        
	       // list=new ArrayList<Integer>();
	        
	    }


}
