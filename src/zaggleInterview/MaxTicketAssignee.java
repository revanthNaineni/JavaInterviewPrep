package zaggleInterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Ticket {
    private int ticketNo;
    private String description;
    private String assignee;
    private String status;

    public Ticket(int ticketNo, String description, String assignee, String status) {
        this.ticketNo = ticketNo;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getStatus() {
        return status;
    }
}

public class MaxTicketAssignee {

    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1, "Issue 1", "John", "Open"));
        tickets.add(new Ticket(2, "Issue 2", "Jane", "Open"));
        tickets.add(new Ticket(3, "Issue 3", "John", "Closed"));
        tickets.add(new Ticket(4, "Issue 4", "Jane", "Open"));
        tickets.add(new Ticket(5, "Issue 5", "John", "Open"));

        // Find the assignee with the maximum ticket count using Streams
        String maxTicketAssignee = tickets.stream()
                .collect(Collectors.groupingBy(Ticket::getAssignee, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Assignee with the maximum number of tickets: " + maxTicketAssignee);
    }
}

