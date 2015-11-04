class MyThread implements Runnable{
   Thread thrd;
   Thread maint;

   MyThread(String n, Thread m) {
      thrd = new Thread(this, n);
      maint = m;
      thrd.start();
   }

   public void run() {
      try {
         maint.join();
         System.out.println("Nope, still here, but " +
                     maint.getName() + " is gone.");
      }
      catch (InterruptedException exc) {
         System.out.println("Something went wrong waiting for main.");
      }
   }
}

class Test {
   public static void main(String args[]) {
      Thread maint = Thread.currentThread();

      MyThread t = new MyThread("Test", maint);

      System.out.println("Goodbye.");
   }
}