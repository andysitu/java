interface IF {
   default void testit() {
      System.out.println("HI");
   }
}

class TestClass implements IF {
   void testit2() {
      System.out.println("BYE");
   }
}

class DefaultIntMethod {
   public static void main(String args[]) {
      TestClass i1 = new TestClass();
      i1.testit();
      i1.testit2();
   }
}