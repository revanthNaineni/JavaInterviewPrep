package asynchronization;
import java.util.concurrent.CompletableFuture;

public class ThenComposeExample {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello"+Thread.currentThread().getName())
            .thenCompose(result -> CompletableFuture.supplyAsync(() -> result + " World"+Thread.currentThread().getName()));

        future.thenAccept(System.out::println); // Output: Hello World
    }
}
