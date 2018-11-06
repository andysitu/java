// Extending thread rather than
// implementing Runnable.

class MyThread extends Thread {

   MyThread(String name) {
      super(name);
      start();
   }

   public void run() {
      System.out.println(getName() + " starting.");
      try {
         for (int i = 0; i < 10; i++) {
            Thread.sleep(400);
            System.out.println("In " + getName() +
                                 ", count is " + i);
         }
      }
      catch(InterruptedException exc) {
         System.out.println(getName() + " interrupted.");
      }
      System.out.println(getName() + " terminating.");
   }
}

class ExtndThread {
   public static void main(String args[]) {
      System.out.println("Main thread starting.");

      MyThread mt = new MyThread("Child #1");

      for (int i = 0; i < 50; i++) {
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