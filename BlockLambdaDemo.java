interface NumericTest {
   int test(int n);
}

class BlockLambdaDemo {
   public static void main(String args[]) {
      NumericTest factorial = (n) -> {
         int result = 1;

         for (int i = 1; i <= n; i++)
            result = i * result;

         return result;
      };

      System.out.println("The factorial of 5 is " + factorial.test(5));
   }
}