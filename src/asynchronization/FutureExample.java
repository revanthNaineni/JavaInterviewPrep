package asynchronization;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create an ExecutorService with a fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Define tasks to be executed asynchronously
        Callable<String> task1 = () -> {
            // Simulate a long-running task
        	System.out.println("Test1");
            Thread.sleep(10000);
            System.out.println("Test2");
            return "Result from Task 1";
        };

        Callable<String> task2 = () -> {
            // Simulate a long-running task
        	System.out.println("Test3");
            Thread.sleep(20000);
            System.out.println("Test4");
            return "Result from Task 2";
        };

        Callable<String> task3 = () -> {
            // Simulate a long-running task
        	System.out.println("Test5");
            Thread.sleep(15000);
            System.out.println("Test6");
            return "Result from Task 3";
        };
        
        
        // Submit tasks to the executor and get Futures
        Future<String> future1 = executor.submit(task1);
        Future<String> future2 = executor.submit(task2);
        Future<String> future3 = executor.submit(task3);

        // Wait for all tasks to complete
        String result1 = future1.get();
        String result2 = future2.get();
        String result3 = future3.get();

        // Process results
        System.out.println("Task 1 Result: " + result1);
        System.out.println("Task 2 Result: " + result2);
        System.out.println("Task 3 Result: " + result3);

        // Shut down the executor
        executor.shutdown();
    }
}
