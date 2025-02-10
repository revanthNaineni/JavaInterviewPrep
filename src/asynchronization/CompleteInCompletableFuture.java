package asynchronization;
import java.util.concurrent.CompletableFuture;

public class CompleteInCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(0); // Simulate a long-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task completed normally";
        });
        
//        int count=0;
//        for (int i = 0; i < 1000; i++) {
//			count++;
//		}

        // Try to complete the future with a fallback value if it doesn't finish in 1 second
        boolean complete = future.complete("Fallback result due to timeout");
        
        System.out.println(complete);

        // Print the result
        System.out.println("Future result: " + future.join()); // Output: Fallback result due to timeout
    }
}
