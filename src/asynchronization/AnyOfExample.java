package asynchronization;
import java.util.concurrent.CompletableFuture;

public class AnyOfExample {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result from Future 1";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result from Future 2";
        });

        CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(future1, future2);

        anyOfFuture.thenAccept(result -> System.out.println("First completed result: " + result));
    }
}
