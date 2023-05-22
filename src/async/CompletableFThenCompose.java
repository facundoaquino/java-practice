package async;

import java.util.concurrent.CompletableFuture;

public class CompletableFThenCompose {

    public static void main(String[] args) throws InterruptedException {

        int value = 10;

//        con thenCompose la salida de un future podemos usarla como entrada de otra llamada async
        getValueAsync(value)
                .thenCompose(integer -> getValueAsync2(integer))
                .thenAccept(result -> System.out.println(result));



        spleep(5000);
    }

    public static CompletableFuture<Integer> getValueAsync(int value) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return processValue(value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static CompletableFuture<Integer> getValueAsync2(int value) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return processValue2(value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
    public static int processValue(int value) throws InterruptedException {
        spleep(1000);
        return 2 * value;
    }
    public static int processValue2(int value) throws InterruptedException {
        spleep(1000);
        return 10 * value;
    }

    private static void spleep(long valueToSpleep) throws InterruptedException {
        Thread.sleep(valueToSpleep);
    }

}
