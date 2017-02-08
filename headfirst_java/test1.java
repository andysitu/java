// Testing if constructors parameter (int vs long)

class Animal {
   Animal() {
      System.out.println("Made an Animal.");
   }
}

class Duck extends Animal{
   String type;

   static void run() {
      System.out.println("The duck ran away.");
   }

   void talk() {
      System.out.println("Quack. Quack. My type is " + type);
   }

   Duck(int i) {
      type = "int";
      System.out.println("You give me an int.");
      // super(); superclass constructor must be first.
      talk();
   }

   Duck(long l) {
      this(5);
      type = "long";
      System.out.println("You gave me an long.");
      talk();
   }
}

class test1 {
   public static void main(String args[]) {
      // Duck di = new Duck(5);

      Duck dl = new Duck(5l);
      dl.run();
      Duck.run();
   }
}