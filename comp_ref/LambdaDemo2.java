interface NumericTest {
   boolean test(int n);
}

class LambdaDemo2 {
   public static void main(String args[]) {
      NumericTest isEven = (n) -> (n % 2) == 0;
      if(isEven.test(10)) System.out.println("10 is even.");

      NumericTest isNonNeg = (n) -> n >= 0;

      if (isNonNeg.test(100)) System.out.println("100 is non-negative.");

      isEven = n -> (n % 2) == 0;
      if(isEven.test(10)) System.out.println("10 is even.");
   }
}