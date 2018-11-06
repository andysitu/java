class VarArgs {
   static void vaTest(int ... v) {
      System.out.println("Number of arguments: " + v.length);
      System.out.println("Contents: ");

      for(int x: v)
         System.out.println(x);

      System.out.println();
   }

   public static void main(String args[]) {
      vaTest(10);
      vaTest(1, 2, 3);
      vaTest();
   }
}