// Use wait() & notify() to create a ticking clock.

class TickTock {
   String state;

   synchronized void tick(boolean running) {
      if(!running) { // stop the clock
         state = "ticked";
         notify(); // notify any waiting threads.
         return;
      }

      System.out.print("Tick ");

      state = "ticked";

      notify(); // let tock run

      try {
         // prevents spurious wakeup from incorrectly restarting thread.
         while (!state.equals("tocked"))
            wait(); // wait for tock to complete
      }
      catch(InterruptedException exc) {
         System.out.println("Thread interrupted.");
      }
   }

   synchronized void tock(boolean running) {
      if(!running) { // stop the clock
         state = "tocked";
         notify();
         return;
      }

      System.out.println("Tock");

      state = "tocked";

      notify(); // notify tock
      try {
         while(!state.equals("ticked"))
            wait();
      }
      catch(InterruptedException exc) {
         System.out.println("Thread interrupted.");
      }
   }
}

class MyThread implements Runnable {
   Thread thrd;
   TickTock ttOb;

   MyThread(String name, TickTock tt) {
      thrd = new Thread(this, name);
      ttOb = tt;
      thrd.start();
   }

   public void run() {
      if (thrd.getName().compareTo("Tick") == 0) {
         for(int i = 0; i < 5; i++)
            ttOb.tick(true);
         ttOb.tick(false);
      }
      else {
         for(int i = 0; i < 5; i++)
            ttOb.tock(true);
         ttOb.tock(false);
      }
   }
}

class ThreadCom {
   public static void main(String args[]) {
      TickTock tt = new TickTock();
      MyThread mt1 = new MyThread("Tick", tt);
      MyThread mt2 = new MyThread("Tock", tt);

      try {
         mt1.thrd.join();
         mt2.thrd.join();
      } catch(InterruptedException exc) {
         System.out.println("Main thread interrupted.");
      }
   }
}