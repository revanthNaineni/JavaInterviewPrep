package functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate=(a,b)->{
			if(a>b) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println(biPredicate.test(10, 10));
	}

}
