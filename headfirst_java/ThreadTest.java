public class ThreadTest {
   public static void main(String args[]) {

      Runnable threadJob = new MyRunnable();
      Thread myThread = new Thread(threadJob);

      myThread.start();

      System.out.println("Back into main thread.");
   }
}