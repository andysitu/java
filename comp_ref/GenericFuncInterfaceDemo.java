interface SomeFunc<T> {
   T test(T n);
}

class GenericFuncInterfaceDemo {
   public static void main(String args[]) {
      SomeFunc<String> reverse = (str) -> {
         String result = "";

         for (int i = str.length() -1; i >= 0; i--)
            result += str.charAt(i);

         return result;
      };

      System.out.println("Lambda reversed is " + reverse.test("Lambda"));

      SomeFunc<Integer> factorial = (n) -> {
         int result = 1;

         for(int i = 2; i <= n; i++)
            result = i * result;

         return result;
      };

      System.out.println("The factorial of 3 is " + factorial.test(3));
      System.out.println("The factorial of 5 is " + factorial.test(5));
   }
}