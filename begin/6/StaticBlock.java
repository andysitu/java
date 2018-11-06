class StaticBlock {
   static int t1;
   int t2;

   static {
      t1 = 10;
      //t2 = 20;
   }

   static void display() {
      System.out.println(t1);
   }

   public static void main(String args[]) {
      display();
   }
}