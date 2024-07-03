package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of Product1 objects containing name, category, and price attributes, utilize Java Streams to partition the Product1s into three groups based on their price range: cheap (price <= 100), moderate (100 < price <= 500), and expensive (price > 500).

class Product1 {
	private String name;
	private String category;
	private Long price;

	public Product1(String name, String category, Long price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product1 [name=" + name + ", category=" + category + ", price=" + price + "]";
	}

}

public class GroupandPartition2 {
	public static void main(String[] args) {
		
		Product1 Product1=new Product1("Fan", "Electronics", 2500L);
		Product1 Product11=new Product1("Fridge", "Electronics", 25000L);
		Product1 Product12=new Product1("Door", "Appliances", 3500L);
		Product1 Product13=new Product1("Bulb", "Electricals", 500L);
		
		List<Product1> product1s=List.of(Product1,Product11,Product12,Product13);
		
		 Map<String, List<streams.Product1>> collect = product1s.stream()
		.collect(Collectors.groupingBy(product -> {
            var price = product.getPrice();
            if (price <= 100) {
                return "Cheap";
            } else if (price <= 500) {
                return "Moderate";
            } else {
                return "Expensive";
            }
        }));
		
		System.out.println(collect);
		
		
		

	}
}
