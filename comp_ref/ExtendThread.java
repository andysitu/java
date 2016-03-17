class NewThread extends Thread{
   NewThread() {
      super("Demo thread");
      System.out.println("Child Thread" + this);
      start();
   }

   public void run () {
      try {
         for (int i = 5; i > 0; i--) {
            System.out.println("Second thread: " + i);
            sleep(500);
         }
      } catch (InterruptedException e) {
         System.out.println("Second Thread interrupted.");
      }
   }
}

class ExtendThread {
   public static void main(String args[]) {
      new NewThread();

      try {
         for (int i = 5; i > 0; i--) {
            System.out.println("Main Thread: " + i);
            Thread.sleep(1000);
         }
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }

      System.out.println("Main thread exiting.");
   }
}