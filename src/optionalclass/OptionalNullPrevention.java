package optionalclass;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalNullPrevention  {
	public static void main(String[] args) {
		// Simulating a potentially nullable value
		String nullableValue = null;

		// Using Optional to prevent null pointer exception
		Optional<String> optionalValue = Optional.ofNullable(nullableValue);

		// Using traditional approach (may lead to null pointer exception)
		try {
			int lengthWithoutOptional = nullableValue.length();
			System.out.println("Length without Optional: " + lengthWithoutOptional);
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
		}finally {
			System.out.println("test");
		}

		// Using Optional approach (no null pointer exception)
		int lengthWithOptional = optionalValue.map(String::length).orElse(0);
		System.out.println("Length with Optional: " + lengthWithOptional);
		if(optionalValue.isPresent()) {
			System.out.println(optionalValue.get());
		}
		optionalValue.ifPresent(System.out::println);
		Consumer<? super String> action = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);				
			}
		};
		optionalValue.ifPresentOrElse(action,()->System.out.println("Dembele"));
	}
}
