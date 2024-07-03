package streams;
//You have a list of Order objects, each containing an order date. Write a Java code snippet using the Stream API to find the latest order date from the list.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class Order{
	LocalDate date;

	public Order(LocalDate date) {
		this.date = date;
	}
	
	public LocalDate getOrderDate() {
        return date;
    }
	
}
public class QStream9 {

	public static void main(String[] args) {
		
		List<Order> orders = List.of(
                new Order(LocalDate.of(2023, 8, 1)),
                new Order(LocalDate.of(2023, 7, 15)),
                new Order(LocalDate.of(2023, 8, 10)),
                new Order(LocalDate.of(2023, 7, 1))
        );

        Optional<LocalDate> latestOrderDate = orders.stream()
        		.map(Order::getOrderDate)
                .max(LocalDate::compareTo);
        

        if (latestOrderDate.isPresent()) {
            System.out.println("Latest Order Date: " + latestOrderDate.get());
        } else {
            System.out.println("No orders found.");
        }
		

	}

}
