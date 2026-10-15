public class MultiThread {

     static volatile  boolean  running = true;

    public static void main(String[] args)
            throws InterruptedException {

        Thread t = new Thread(() -> {
            while (running) {
                // Keep running
            }
            System.out.println("Stopped");
        });

        t.start();
        Thread.sleep(1000);
        running = false;
    }
}
