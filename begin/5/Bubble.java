class Bubble {
   public static void main(String args[]) {
      int nums[] = {99, -100, 0, 1000, 23242, -424242, 10424, 654, 948, 6780};

      int size = 10, a, b, t;

      System.out.println("The array consist of ");
      for (int i = 0; i < size; i++) 
         System.out.print(nums[i] + " ");
      System.out.println();
      

      for (a = 1; a < size; a++) {
         for (b = size - 1; b >= a; b--) {
            if (nums[b] < nums[b-1]) {
               t = nums[b-1];
               nums[b-1] = nums[b];
               nums[b] = t;
            }
         }
      }


      System.out.println("The sorted array consist of ");
      for (int i = 0; i < size; i++)
         System.out.print(nums[i] + " ");
      System.out.println();
   }
}