enum Apple {
   Fuji(10), GoldenDel(9), Smith(5), Cortland(8), Tasy(14), Magic;

   private int price;

   Apple(int p) { price = p; }

   Apple() { price = -1; }

   int getPrice() { return price; }
}

class Enums {
   public static void main(String args[]) {
      Apple ap;

      System.out.println("Fuji costs " +
                           Apple.Fuji.getPrice() +
                           " cents.\n");
      System.out.println("All of the apple prices:");

      try {
         for (Apple a: Apple.values()) {
            System.out.println(a + " costs " + a.getPrice() + " cents.");
            System.out.println("Ordinal value: " + a.ordinal());
            Thread.sleep(100);
         }
      } catch (InterruptedException e) {}
   }
}