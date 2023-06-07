package async;

import java.util.concurrent.CompletableFuture;

public class CompletableFApplyAsync {
    public static void main(String[] args) {

        CompletableFuture.supplyAsync(() -> HardProcess.longTask())
                .thenApply(integer -> doSomething(integer))
                .thenAccept(integer -> System.out.println("integer modified.. = " + integer));

        System.out.println("Splipping for ten seconds...");
        sleepALittle();
        System.out.println("SplippingDone...");

    }


    private static void sleepALittle() {
        try {
//            simulamos un proceso largo que puede demorar o pesado
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    private static int doSomething(int value) {
        if(value % 2 == 0) {
            return value + 2;
        }
        return value + 1;
    }
}
