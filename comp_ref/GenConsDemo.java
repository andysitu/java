class GenCons {
   private double val;

   <T extends Number>GenCons(T a) {
      val = a.doubleValue();
   }

   void showval() {
      System.out.println("val: " + val);
   }
}

class GenConsDemo {
   public static void main(String args[]) {
      GenCons test = new GenCons(100);
      GenCons test2 = new GenCons(140.0F);

      test.showval();
      test2.showval();
   }
}