class NewThread implements Runnable {
   Thread t;
   String name;

   NewThread() {
      t = new Thread(this, "Running Thread");
      System.out.println("Child thread: " + t);
      t.start();      
   }

   public void run() {
      try {
         for (int i = 5; i > 0; i--) {
            name = t.getName();
            System.out.println("Child Thread: " + i + " " + name);
            Thread.sleep(500);
         }
      } catch(InterruptedException e) {
         System.out.println("Child interrupted.");
      }
      System.out.println("Exiting child thread.");
   }
}

class RunThread {
   public static void main(String args[]) {
      new NewThread();

      try {
         for (int i = 5; i > 0; i--) {
            System.out.println("Main Thread: " + i);
            Thread.sleep(1000);
         }
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted");
      }
      System.out.println("Main thread exiting.");
   }
}