package asynchronization;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncUsingCompletableFuture {

    public static void main(String[] args) {
        System.out.println("Starting asynchronous tasks...");

        // Define CompletableFuture tasks
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            //delay(1000); // Simulate a delay
        	//System.out.println("task1 running");
            return "Result of Task 1";
        });

        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            delay(2000); // Simulate a longer delay
            return "Result of Task 2";
        });

        CompletableFuture<String> task3 = CompletableFuture.supplyAsync(() -> {
            delay(1500); // Simulate a delay
            return "Result of Task 3";
        });
        
        CompletableFuture<String> thenApply = task1.thenApply(result->result+", Revanth");
        thenApply.thenAccept(System.out::println);

        // Combine all tasks and execute them asynchronously
        CompletableFuture<Void> allTasks = CompletableFuture.allOf(task1, task2, task3);

        // When all tasks complete, retrieve and print results
            try {
                System.out.println("Task 1 result: " + task1.get());
                System.out.println("Task 2 result: " + task2.get());
                System.out.println("Task 3 result: " + task3.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }

        System.out.println("Main thread is free to do other work while tasks complete.");
    }

    // Helper method to simulate a delay
    private static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
