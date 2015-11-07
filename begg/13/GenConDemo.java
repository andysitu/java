class Summation {
   private int sum;

   <T extends Number> Summation(T arg) {
      sum = 0;

      int len = arg.intValue();

      for (int i = 0; i < len; i++)
         sum += i;
   }

   int getSum() {
      return sum;
   }
}

class GenConDemo {
   public static void main(String args[]) {
      Summation ob = new Summation(10.0);

      System.out.println("Summation of 10.0 is " + ob.getSum());
   }
}