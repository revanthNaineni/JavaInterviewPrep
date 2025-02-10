package asynchronization;
import java.util.concurrent.*;
import java.util.function.Function;

public class CompletableFutureWithAllMethods{

    public static void main(String[] args) {
        // Create an executor to run async tasks
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Create a CompletableFuture that simulates a long-running task
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Running asynchronous task..."+Thread.currentThread().getName());
                Thread.sleep(3000); // Simulate a task that takes 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        }, executorService);

        // 1. Using thenApply() to process the result of the async task
        CompletableFuture<String> processedFuture = future.thenApply(result -> {
            System.out.println("Processing result..."+Thread.currentThread().getName());
            return "Processed result: " + (result * 2); // Process the result
        });

        // 2. Using thenAccept() to consume the result (no return value)
        processedFuture.thenAccept(result -> {
            System.out.println("Consuming the result: " + result+Thread.currentThread().getName());
        });

        // 3. Using whenComplete() to handle success or exception after the task
        processedFuture.whenComplete((result, exception) -> {
            if (exception == null) {
                System.out.println("Task completed successfully with result: " + result);
            } else {
                System.out.println("Task completed exceptionally: " + exception.getMessage());
            }
        });

        // 4. Using handle() to handle both success and failure
        processedFuture.handle((result, exception) -> {
            if (exception != null) {
                return "Handled failure: " + exception.getMessage();
            } else {
                return "Handled success: " + result;
            }
        }).thenAccept(System.out::println);

        // 5. Using exceptionally() to handle errors and provide a fallback
        processedFuture.exceptionally(ex -> {
            System.out.println("Exception caught, providing fallback.");
            return "Fallback value";
        }).thenAccept(System.out::println);

        // 6. Using orTimeout() to handle timeout
        CompletableFuture<Integer> futureWithTimeout = future.completeOnTimeout(50, 2, TimeUnit.SECONDS);

        // 7. Using completeOnTimeout() to complete the future with a value if it times out
        futureWithTimeout.thenAccept(result -> {
            System.out.println("Result after timeout check: " + result);
        });

        // 8. Using allOf() to wait for multiple futures to complete
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10, executorService);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 20, executorService);
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2);
        allFutures.thenRun(() -> {
            try {
                System.out.println("All futures completed: " + (future1.get() + future2.get()));
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        // 9. Using anyOf() to complete when any future completes
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 5;
        }, executorService);

        CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(future, future3);
        anyFuture.thenAccept(result -> System.out.println("First completed future result: " + result));

        // 10. Using get() to block and get the result of the future
        try {
            Integer result = future.get(); // Blocks and waits for the result
            System.out.println("Blocking get result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // 11. Using join() to block and get the result, but as an unchecked exception
        try {
            Integer joinResult = future.join(); // Blocks and waits for the result
            System.out.println("Blocking join result: " + joinResult);
        } catch (CompletionException e) {
            e.printStackTrace();
        }

        // 12. Using isDone() to check if the task is completed
        System.out.println("Is future done? " + future.isDone());

        // 13. Using isCompletedExceptionally() to check if the task completed exceptionally
        System.out.println("Is future completed exceptionally? " + future.isCompletedExceptionally());

        // Shutdown the executor service
        executorService.shutdown();
    }
}
