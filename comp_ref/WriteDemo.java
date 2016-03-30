class WriteDemo {
   public static void main(String args[]) {
      int b;

      b = 'A';

      String test = "Does this work?";
      System.out.write(b);
      System.out.write('T');
      // for some reason, \n is needed before anything shows.
      // and anything written after it is discarded.
      System.out.write('\n');
   }
}