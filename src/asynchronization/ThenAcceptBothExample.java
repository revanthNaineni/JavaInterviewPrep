package asynchronization;
import java.util.concurrent.CompletableFuture;

public class ThenAcceptBothExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 5);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 10);

        future1.thenAcceptBoth(future2, (result1, result2) -> 
            System.out.println("Sum: " + (result1 + result2))
        );
    }
}
