class Static {
   static int y;
   int x;

   void show() {
      System.out.println(x + " " + y);
   }
}

class StaticTry {
   public static void main(String args[]) {
      Static ob1 = new Static();
      Static ob2 = new Static();

      ob1.x = 10;
      ob2.x = 20;
      ob1.y = 40;

      ob1.show();
      ob2.show();

      Static.y = 100;

      ob1.show();
      ob2.show();
   }
}