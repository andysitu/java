class Finalize {
   public static void main(String args[]) {
      FDemo ob = new FDemo(0);

      int count;

      for (count = 0; count < 1000000; count++)
         ob.generator(count);
   }
}