package functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, String> biFunction=(a,b)->{
			return a+" : "+b;
		};
		
		System.out.println(biFunction.apply(20,10));
	}

}
