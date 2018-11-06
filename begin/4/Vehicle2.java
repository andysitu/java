class Vehicle2 {
   int passengers;
   int fuelcap;
   int mpg;

   void range() {
      System.out.println("The range is " + fuelcap * mpg);
   }

   void displayInfo() {
      System.out.println("The car can hold " + passengers + " passengers.");
      range();
   }
}