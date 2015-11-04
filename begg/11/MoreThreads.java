// Create multiple Threads

class MyThread implements Runnable {
   Thread thrd;
   MyThread(String name) {
      thrd = new Thread(this, name);
      
      thrd.start();
   }

   public void run() {
      System.out.println(thrd.getName() + " starting.");
      try {
         for (int i = 0; i < 10; i++) {
            Thread.sleep(400);
            System.out.println("In " + thrd.getName() +
                                 ", count is " + i);
         }
      }
      catch(InterruptedException exc) {
         System.out.println(thrd.getName() + " interrupted.");
      }
   }
}

class MoreThreads {
   public static void main(String args[]) {
      System.out.println("Main thread starting.");

      MyThread mt1 = new MyThread("Child #1");
      MyThread mt2 = new MyThread("Child #2");
      MyThread mt3 = new MyThread("Child #3");

      for (int i = 0; i < 100; i++) {
         System.out.print(".");
         try {
            Thread.sleep(50);
         }
         catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
         }
      }

      System.out.println("Main thread ending.");
   }
}