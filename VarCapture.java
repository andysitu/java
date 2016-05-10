// Capture a local variable from enclosing scope.

interface MyFunc {
   int func(int n);
}

class VarCapture {
   static int i = 10;

   public static void main(String args[]) {
      int num = 10;

      // Lambda expression; notice the scope.
      MyFunc myLambda = (n) -> {
         int v = num + n;

         i++;
         //num++

         return v;
      };

      System.out.println("The value is " + myLambda.func(10));
      System.out.println("Now i is " + i);

      //num = 9
   }
}