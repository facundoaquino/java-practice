package async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class CompletableFApplyAsync2 {

//    por defecto si no se pasa como 2do parametro el completablefuture ocupa el commonPool

    public static int compute(){
        System.out.println("Tread on compute.. " +  Thread.currentThread());
        return 10;
    }

    public static void printResult(int value){
        System.out.println("Tread on print.. " +  Thread.currentThread());
        System.out.println("value is .. " +  value);
    }

    public static CompletableFuture<Integer> create(){
        return CompletableFuture.supplyAsync(() -> compute());
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Tread on main.. " +  Thread.currentThread());
        CompletableFuture<Integer> cf = create();

        Thread.sleep(1000);

        cf.thenAccept(CompletableFApplyAsync2::printResult);

    }
}
