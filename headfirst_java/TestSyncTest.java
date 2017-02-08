class TestSync implements Runnable{
   private int balance = 0;

   public void run() {
      for (int i = 0; i < 50; i++) {
         increment();
         System.out.print(balance + " ");
      }
   }

   public void increment() {
      balance++;
   }
}

public class TestSyncTest {
   public static void main(String[] args) {
      TestSync runner = new TestSync();
      Thread a = new Thread(runner);
      Thread b = new Thread(runner);
      a.start();
      b.start();
   }
}