package async;

import java.util.concurrent.CompletableFuture;

public class CompletableFThenCombine {

    public static void main(String[] args) throws InterruptedException {

        int value = 10;

//        combinamos los dos resultados esperados , una tarea async en este caso tarda mas que la otra
        getValueAsync(value)
                .thenCombine(getValueAsync2(value), (integer, integer2) -> integer + integer2)
                .thenAccept(result -> System.out.println(result));



        spleep(10000);
    }

    public static CompletableFuture<Integer> getValueAsync(int value) throws InterruptedException {
        System.out.println("get value iniciando..");
        spleep(2000);

        return CompletableFuture.supplyAsync(() -> {
            try {
                return processValue(value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static CompletableFuture<Integer> getValueAsync2(int value) throws InterruptedException {
        System.out.println("get value 2 iniciando");
        spleep(3000);

        return CompletableFuture.supplyAsync(() -> {
            try {
                return processValue2(value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
    public static int processValue(int value) throws InterruptedException {
        spleep(2000);
        return 2 * value;
    }
    public static int processValue2(int value) throws InterruptedException {
        spleep(9000);
        return 10 * value;
    }

    private static void spleep(long valueToSpleep) throws InterruptedException {
        Thread.sleep(valueToSpleep);
    }

}
