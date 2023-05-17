package async;

import java.util.concurrent.CompletableFuture;

public class CompletableFExample1 {
//    simulamos una app corriendo y varios procesos async , la idea es ver como esos procesos terminan en tiempos diferentes


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting...");

        CompletableFuture.supplyAsync(HardProcess::longTask)
                .thenAccept(integer -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procces 1 finished");
                });

        CompletableFuture.supplyAsync(HardProcess::longTask)
                .thenAccept(integer -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procces 2 finished");
                });

        CompletableFuture.supplyAsync(HardProcess::longTask)
                .thenAccept(integer -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procces 3 finished");
                });

        CompletableFuture.supplyAsync(HardProcess::longTask)
                .thenAccept(integer -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procces 4 finished");
                });

        CompletableFuture.supplyAsync(HardProcess::longTask)
                .thenAccept(integer -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procces 5 finished");
                });

        CompletableFuture.supplyAsync(HardProcess::longTask)
                .thenAccept(integer -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procces 6 finished");
                });

        CompletableFuture.supplyAsync(HardProcess::longTask)
                .thenAccept(integer -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procces 7 finished");
                });

        CompletableFuture.supplyAsync(HardProcess::longTask)
                .thenAccept(integer -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procces 8 finished");
                });

        CompletableFuture.supplyAsync(HardProcess::longTask)
                .thenAccept(integer -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procces 9 finished");
                });

        CompletableFuture.supplyAsync(HardProcess::longTask)
                .thenAccept(integer -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procces 10 finished");
                });



        longSpleeping();
    }

    public static void longSpleeping() throws InterruptedException {
        Thread.sleep(Long.MAX_VALUE);
    }
}
