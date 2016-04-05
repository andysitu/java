import static java.lang.System.out;

class test {
   public static double average(double ... nums) {
      double total = 0.0;
      int i, len = nums.length;

      for (i = 0; i < len; i++) {
         total += nums[i];
      }

      return total / len;
   }

   public static void main(String args[]) {
      out.println("The average of 2, 3, 4, and 5 is : " + average(2.0, 3.0, 4.0, 5.0));
   }
}