interface StringFunc {
   String func(String n);
}

interface Frack {
   void test();
}

class BlockLambdaDemo2 {
   public static void main(String args[]) {
      StringFunc reverse = (str) -> {
         String result ="";

         for (int i = str.length() -1; i >= 0; i--)
            result += str.charAt(i);

         return result;
      };

      System.out.println("The reverse of Lambda is" + reverse.func("Lambda"));

      Frack f = () -> System.out.println("HI");
      f.test();
   }
}