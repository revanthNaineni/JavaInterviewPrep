package streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Product2 (String name,
        String category,
        int price) {}



public class CalculateTheTotalPriceOfProductsByCategory {
	public static void main(String[] args) {
		
	Stream<Product2> products = Stream.of(
			new Product2("Laptop",
			        "Electronics", 1000),
			new Product2("TV",
			        "Electronics", 1500),
			new Product2("Sofa",
			        "Furniture", 700),
			new Product2("Table",
			        "Furniture", 300),
			new Product2("Lamp",
			        "Home Decor", 50)
			);
	
			Map<String, Integer> collect = products
					.collect(Collectors.groupingBy(Product2::category, Collectors.summingInt(Product2::price)));
			System.out.println(collect);
	
	}
	
	

}
