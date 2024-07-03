package streams;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class FindWinnerandLooser {
	
	    public static void main(String[] args) {
	        String votes = "aaaaaabbbbbbbccccddddd";

	        // Count the votes for each contestant
	        Map<Character, Long> voteCounts = votes.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(s->s, Collectors.counting()));

	        // Find the contestant with maximum and minimum votes
	        Character winner = voteCounts.entrySet().stream()
	                .max(Comparator.comparing(Map.Entry::getValue))
	                .map(Map.Entry::getKey)
	                .orElse(null);

	        Character looser = voteCounts.entrySet().stream()
	                .min(Map.Entry.comparingByValue())
	                .map(Map.Entry::getKey)
	                .orElse(null);

	        // Print the results
	        if (winner == null) {
	            System.out.println("No Winner");
	        } else {
	            System.out.println("Winner: " + winner);
	        }

	        if (looser == null) {
	            System.out.println("No Looser");
	        } else {
	            System.out.println("Looser: " + looser);
	        }
	    }


}
