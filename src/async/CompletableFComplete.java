package async;

import java.util.concurrent.CompletableFuture;

public class CompletableFComplete {

//    usando metodo complete() en completableFuture

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting...");

        CompletableFuture<Integer> integerCompletableFuture = new CompletableFuture<>();
        int value = 10;

        getReady(integerCompletableFuture);

        integerCompletableFuture.complete(value);

        longSpleeping();
    }

    public static void getReady(CompletableFuture<Integer> integerCompletableFuture) {
        integerCompletableFuture
                .thenApply(integer -> integer + 10)
                .thenApply(integer -> integer + 20)
                .thenAccept(System.out::println);
    }

    public static void longSpleeping() throws InterruptedException {
        Thread.sleep(Long.MAX_VALUE);
    }
}
