package asynchronization;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncUsingExecutorService {

    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Define Callable tasks
        Callable<String> task1 = () -> {
            Thread.sleep(1000); // Simulate a delay
            return "Result of Task 1";
        };

        Callable<String> task2 = () -> {
            Thread.sleep(2000); // Simulate a longer delay
            return "Result of Task 2";
        };

        Callable<String> task3 = () -> {
            Thread.sleep(1500); // Simulate a delay
            return "Result of Task 3";
        };

        // Submit tasks to ExecutorService
        Future<String> future1 = executorService.submit(task1);
        Future<String> future2 = executorService.submit(task2);
        Future<String> future3 = executorService.submit(task3);

        try {
            // Retrieve and print the results
            System.out.println("Waiting for tasks to complete...");
            System.out.println("Task 1 result: " + future1.get());
            System.out.println("Task 2 result: " + future2.get());
            System.out.println("Task 3 result: " + future3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shut down the ExecutorService
            executorService.shutdown();
        }
    }
}
