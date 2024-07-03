package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Suppose you have a list of Order objects, each containing orderId, customerId, and totalPrice attributes. Using Java Streams, partition the orders into two groups: high-value orders (totalPrice > 1000) and regular orders, for each customer.
class Order1{
	
	private int Order1Id;
    private int customerId;
    private double totalPrice;

    public Order1(int Order1Id, int customerId, double totalPrice) {
        this.Order1Id = Order1Id;
        this.customerId = customerId;
        this.totalPrice = totalPrice;
    }

    public int getOrder1Id() {
        return Order1Id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

	@Override
	public String toString() {
		return "Order1 [Order1Id=" + Order1Id + ", customerId=" + customerId + ", totalPrice=" + totalPrice + "]";
	}
    
    
}
public class GroupandPartition3 {
	public static void main(String[] args) {
		
	List<Order1> orders = Arrays.asList(
            new Order1(1, 101, 1200),
            new Order1(2, 102, 800),
            new Order1(3, 101, 600),
            new Order1(4, 103, 1500),
            new Order1(5, 102, 400),
            new Order1(6, 101, 1100)
    );
	
	Map<Boolean, List<Order1>> collect = orders.stream()
	.collect(Collectors.partitioningBy(o->o.getTotalPrice()>1000));
	
	 Map<String, List<Order1>> collect2 = orders.stream()
			.collect(Collectors.groupingBy(o->o.getTotalPrice()>1000? "high value":"low value"));
	 
	
	System.out.println(collect);
	System.out.println(collect2);
	
	}
}
