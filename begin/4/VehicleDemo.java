class VehicleDemo {
   public static void main(String args[]) {
      int range;
      Vehicle minivan = new Vehicle();

      minivan.passengers = 7;
      minivan.fuelcap = 16;
      minivan.mpg = 21;

      range = minivan.fuelcap * minivan.mpg;
      System.out.println("Minivan can travel " + range + " miles with " + minivan.  passengers + " passsengers.");
   }
}