class NewThread implements Runnable {
   Thread t;

   NewThread() {
      t = new Thread(this, "Running Thread");
      System.out.println("Second thread: " + t);
      t.start();
   }

   public void run() {
      for (int i = 5; i > 0; i--) {
         try {
            System.out.println("Running Thread: " + i);
            Thread.sleep(500);            
         } catch (InterruptedException e) {
            System.out.println("Second thread is interrupted.");
         }
         
      }
      System.out.println("Exiting child thread.");
   }
   
}

class RunThread1 {
   public static void main(String args[]) {
      new NewThread();

      try {
         for (int i = 5; i > 0; i--) {
            System.out.println("Main Thread: " + i);
            Thread.sleep(1000);
         }
      } catch (InterruptedException e) {
         System.out.println("Interrupted Main Thread");
      }

      System.out.println("Main thread is exiting. Bye");
   }
}