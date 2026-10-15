public class Thread1 {
     static  int count ;

     public synchronized void  getCount(){

        count++;
     }
    public static void main(String[] args) throws InterruptedException {
        

        

         Thread t1=new Thread(()->{
            for(int i=1;i<=100;i++){
                count++;
            }
         });

          Thread t2=new Thread(()->{
            for(int i=1;i <=100;i++){
                count++;
            }
          });

          t1.start();
          t2.start();

          t1.join();
          t2.join();


          System.out.println(count);
    }
}
