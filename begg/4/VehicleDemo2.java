class VehicleDemo2 {
   public static void main(String args[]) {
      Vehicle2 minivan = new Vehicle2();
      minivan.fuelcap = 17;
      minivan.mpg = 15;
      minivan.passengers = 7;

      minivan.range();
      minivan.displayInfo();
   }
}