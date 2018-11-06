class VarArgs2 {
   static void vaTest(String msg, int ... v) {
      System.out.println(msg + v. length);
      System.out.println("Contents: ");

      for (int x: v)
         System.out.println(x);

      System.out.println();
   }

   public static void main(String args[]) {
      vaTest("One vararg ", 10);
      vaTest("size vararg ", 4, 2, 5, 6, 7, 3);
      vaTest("no vararg ");
   }
}