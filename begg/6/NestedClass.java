class Outer {
   int nums[];

   Outer(int n[]) {
      nums = n;
   }

   void analyze() {
      Inner inOb = new Inner();

      System.out.println("min: " + inOb.min());
      System.out.println("max: " + inOb.max());
      System.out.println("avg: " + inOb.avg());
   }

   class Inner {
      int min() {
         int mini = nums[0];

         for (int i = 1, len = nums.length; i < len; i++ )
            if (mini > nums[i])
               mini = nums[i];

         return mini;
      }

      int max() {
         int m = nums[0];

         for (int i = 1, len = nums.length; i < len; i++)
            if (m < nums[i])
               m = nums[i];

         return m;
      }

      int avg() {
         int sum = 0;
         for (int i: nums)
            sum += i;

         return sum / nums.length;
      }
   }
}

class NestedClass {
   public static void main(String args[]) {
      int x[] = { 3, 2, 1, 5, 6, 9, 7, 8 };
      Outer outOb = new Outer(x);

      outOb.analyze();
   }
}