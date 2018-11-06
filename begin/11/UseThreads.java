class MyThread implements Runnable {
   String threadName;

   MyThread(String name) {
      threadName = name;
   }

   public void run() {
      System.out.println(threadName + "starting.");
      try {
         for(int count = 0; count < 10; count++) {
            Thread.sleep(400);
            System.out.println("In " + threadName + ", count is " + count);
         }
      }
      catch(InterruptedException exc) {
         System.out.println(threadName + " interrupted.");
      }
      System.out.println(threadName + " terminating.");
   }
}

class UseThreads {
   public static void main(String args[]) {
      System.out.println("Main thread starting.");

      // Runnable object (implements Runnable);
      MyThread mt = new MyThread("Child #1");

      // Thread of that runnable object
      Thread newThread = new Thread(mt);

      newThread.start();

      for(int i = 0; i < 50; i++) {
         System.out.print(".");
         try {
            Thread.sleep(100);
         }
         catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
         }
      }

      System.out.println("Main thread ending.");
   }
}