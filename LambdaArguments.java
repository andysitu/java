interface StringFunc {
   String func(String n);
}

class LambdaArgument {
   static String stringOp(StringFunc sf, String s) {
      return sf.func(s);
   }

   public static void main(String args[]) {
      String inStr = "Lambdas, input string, Hello";
      String outStr;

      System.out.println("The input string is " + inStr);

      outStr = stringOp((str) -> str.toUpperCase(), inStr);
      System.out.println("The string in uppercase: " + outStr);

      outStr = stringOp((str) -> {
                        String result = "";
                        int i;

                        for (i = 0; i < str.length(); i++) {
                           if (str.charAt(i) != ' ')
                              result += str.charAt(i);
                        }
                        return result;
               }, inStr);

      System.out.println("The string with spaces removed: " + outStr);

      StringFunc reverse = (str) -> {
         String output = "";
         for (int i = str.length() -1; i >= 0; i--)
            output += str.charAt(i);

         return output;
      };

      outStr = stringOp(reverse, inStr);
      System.out.println("The string reversed is " + outStr);
   }
}