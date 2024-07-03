package infinite;

public class Infinite {

	public static void main(String[] args) {
		Double a=2/0.0;
		System.out.println(a.isInfinite());
		System.out.println(a.isNaN());
		System.out.println(a);
		
		double value1 = 5.0 / 0.0; // Positive infinity
        double value2 = 0.0 / 0.0; // NaN
        double value3 = 42.0; // A regular number

        System.out.println("Is value1 NaN? " + Double.isNaN(value1)); // false
        System.out.println("Is value2 NaN? " + Double.isNaN(value2)); // true
        System.out.println("Is value3 NaN? " + Double.isNaN(value3)); // false
		
		
		Integer b=2/0;
		System.out.println(b);
	}

}
