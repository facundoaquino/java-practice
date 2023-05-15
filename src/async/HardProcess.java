package async;

public class HardProcess {
    public static int longTask() {
        try {
            int duration = 1000 + (int) (Math.random() * 3000);
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Long task was interrupted: " + e.getMessage());
        }
            return 101;
    }
    public static void longTaskVoid() {
        try {
            int duration = 1000 + (int) (Math.random() * 3000);
            System.out.println("Long process void in progress...");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Long task was interrupted: " + e.getMessage());
        }
    }
}
