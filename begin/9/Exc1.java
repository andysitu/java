class Exc1 {
   public static void main(String args[]) {
      int nums[] = new int[4];

      try {
         System.out.println("Before exception is generated.");

         nums[7] = 10;
         System.out.println("This won't be displayed.");
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("The exception array index out of bounds has been caught.");
      }
   }
}