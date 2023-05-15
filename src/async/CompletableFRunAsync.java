package async;

import java.util.concurrent.CompletableFuture;

public class CompletableFRunAsync {
    public static void main(String[] args) {

        CompletableFuture.runAsync(HardProcess::longTaskVoid);

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
}
