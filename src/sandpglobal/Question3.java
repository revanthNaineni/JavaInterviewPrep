package sandpglobal;

import java.util.ArrayList;
import java.util.List;

/*Can we simplify below statement?
if(list != null && list.size() >0)
*/
public class Question3 {
	
	public static void main(String[] args) {
		List<Integer> list = null;
		
		/*
		 * if(list.size()>0) { System.out.println("hello"); }
		 */
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		if(list2.isEmpty()) {
			System.out.println("hello");
		}
	}
	
	
}
	
	

