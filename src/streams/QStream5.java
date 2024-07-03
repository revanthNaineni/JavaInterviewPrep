package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//You have a list of Product objects, each with a name, price, and category. Write a Java code snippet using the Stream API to find the total price of all products in a specific category.

class Product{
	String name;
	double price;
	String category;
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	
}
public class QStream5 {

	public static void main(String[] args) {
		
		Product product1=new Product("Dress", 500, "Clothes");
		Product product2=new Product("Mobile", 25000, "Electronics");
		Product product3=new Product("Bat", 5000, "Sports");
		Product product4=new Product("Football", 1000, "Sports");
		Product product6=new Product("Football", 1000, "Sports");
		Product product5=new Product("Bowl", 500, "Kitchen");
		
		List<Product> list=new ArrayList<>();
		
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);
		list.add(product6);
		
		Optional<Double> reduce = list.stream()
		.filter(p->p.category.equals("Sports"))
		.map(p->p.price)
		.reduce((p,q)->p+q);
		
		//SecondWay
		double sum = list.stream()
				.filter(p->p.category.equals("Sports"))
				.mapToDouble(p->p.price)
				.sum();
		
		System.out.println(reduce);

	}

}
