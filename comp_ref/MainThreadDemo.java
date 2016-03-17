class MainThreadDemo {
   public static void main(String args[]) {
      Thread t = Thread.currentThread();

      System.out.println("Starting thread: " + t);

      t.setName("My Thread");

      System.out.println("New Thread name: " + t);

      try {
         for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            t.sleep(1000);
         }
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted");
      } finally {
         System.out.println("Done");
      }
      System.out.println("Peace Out");
   }
}