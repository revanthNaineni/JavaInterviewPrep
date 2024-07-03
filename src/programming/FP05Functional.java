package programming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.Supplier;


public class FP05Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Supplier<Integer> supplier=()->{ return 2; };
		 */
		
		BiPredicate<Integer,Integer> bi=(a,b)->a>b;
		System.out.println(bi.test(2, 7));
		
		BiFunction<Integer,Integer,Integer> bif=(a,b)->a-b;
		System.out.println(bif.apply(8, 10));
		
		BiConsumer<Integer, Integer> bic=(a,b)->System.out.println(a+" : "+b);
		bic.accept(22, 33);
		
		IntBinaryOperator intBi=(a,b)->(a*b);
		System.out.println(intBi.applyAsInt(21, 20));
		
		IntConsumer intC=a->System.out.println(a);
		intC.accept(49);
		
	}

}
