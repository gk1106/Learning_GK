public class Counter {
     static int count = 0;
//Mutual exclusion and memory visibility
     static synchronized void increment(){
        count++;
     }

    public static void main(String[] args)
            throws InterruptedException {

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count);
    }
}