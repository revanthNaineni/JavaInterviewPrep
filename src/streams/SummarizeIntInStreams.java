package streams;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummarizeIntInStreams {

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

//Using SummaryStatistics for product prices
        //sum, average, min, max, count (5 metrics)

        Map<String, IntSummaryStatistics> summaryStatisticsByCategory =
               products.collect(Collectors.groupingBy
                        (Product2::category,
                                Collectors.summarizingInt(Product2::price)
                        ));

        System.out.println(summaryStatisticsByCategory);
        
	}

}
