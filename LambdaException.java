interface DoubleNumericArrayFunc {
   double func(double n[]) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
   EmptyArrayException() {
      super("Empty Array");
   }
}

class LambdaException {
   public static void main(String args[]) throws EmptyArrayException
   {
      double[] values = {1.0, 2.0, 3.0, 4.0};

      DoubleNumericArrayFunc average = (n) -> {
         double value = 0.0;

         if (n.length==0)
            throw new EmptyArrayException();

         for (int i = 0; i < n.length; i++) {
            value += n[i];
         }

         return value / n.length;
      };

      System.out.println("The average of " + values + " is " + average.func(values));

      System.out.println("The average of an empty array is " + average.func(new double[0]));
   }
}