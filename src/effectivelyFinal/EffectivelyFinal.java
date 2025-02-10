package effectivelyFinal;

import java.util.List;

public class EffectivelyFinal {

	public static void main(String[] args) {

		  int effectivelyFinalVariable = 10; // effectively final variable
		  //effectivelyFinalVariable=12;    //If we re-assign the value, we will get compilation error
		  List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10,10,12,13);
		  list.stream()
		  .filter(s->s==effectivelyFinalVariable)
		  .forEach(System.out::println);
		  
		  

	}

}
