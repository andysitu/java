class scope {
   public static void main(String[] args) {
      int y = 10;

      {
         y++;
         int x = 0;
      }

      System.out.println(y);
      // System.out.println(x);
   }
}