public class MyRunnable implements Runnable {
   public void run() {
      go();
   }

   public void go() {
      try {
         Thread.sleep(100);
      } catch(InterruptedException ex) {
         ex.printStackTrace();
      }

      goMore();
   }

   public void goMore() {
      System.out.println("On the top stack");
   }
}
