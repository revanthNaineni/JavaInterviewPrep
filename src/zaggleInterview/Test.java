package zaggleInterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1, "Issue 1", "John", "Open"));
        tickets.add(new Ticket(2, "Issue 2", "Jane", "Open"));
        tickets.add(new Ticket(3, "Issue 3", "John", "Closed"));
        tickets.add(new Ticket(4, "Issue 4", "Jane", "Open"));
        tickets.add(new Ticket(5, "Issue 5", "John", "Open"));
        
        //Find the assignee with the maximum ticket count using Streams
        Map<String, Long> map = tickets.stream()
        .collect(Collectors.groupingBy(Ticket::getAssignee, Collectors.counting()));
        
        String string = map.entrySet().stream()
        .max(Comparator.comparing(Map.Entry::getValue))
        .map(Map.Entry::getKey)
        .orElse(null);
        
        System.out.println(string);
        
	}

}
