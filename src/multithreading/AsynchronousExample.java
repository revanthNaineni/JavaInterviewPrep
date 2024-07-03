package multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsynchronousExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Task 1
        CompletableFuture<Void> futureTask1 = CompletableFuture.runAsync(() -> {
            System.out.println("Task 1: Start");
            doTask1();
            System.out.println("Task 1: End");
        });

        // Task 2
        CompletableFuture<Void> futureTask2 = CompletableFuture.runAsync(() -> {
            System.out.println("Task 2: Start");
            doTask2();
            System.out.println("Task 2: End");
        });

        // Wait for both tasks to complete
        CompletableFuture.allOf(futureTask1, futureTask2).get();
    }

    private static void doTask1() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Task 1 - " + i + " ");
        }
        System.out.println();
    }

    private static void doTask2() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Task 2 - " + i + " ");
        }
        System.out.println();
    }
}

