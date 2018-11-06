class NumericFns<T extends Number> {
   T num;

   NumericFns(T n) {
      num = n;
   }

   double reciprocal() {
      return 1 / num.doubleValue();
   }

   double fraction() {
      return num.doubleValue() - num.intValue();
   }

   void show() {
      System.out.println(num.getClass().getName());
   }
}

class BoundDemo {
   public static void main(String args[]) {
      NumericFns<Integer> iOb =
         new NumericFns<Integer>(5);

      System.out.println("Reciprocal: " + iOb.reciprocal());
      System.out.println("Fractional component: " + iOb.fraction());
      iOb.show();

      System.out.println();

      NumericFns<Double> dOb =
         new NumericFns<Double>(5.25);
      System.out.println("Reciprocal: " + dOb.reciprocal());
      System.out.println("Fractional component: " + dOb.fraction());
      dOb.show();
   }
}