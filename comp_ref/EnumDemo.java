enum Apple {
   Jonathan, GoldenDel, RedDel, Winesape, Cortland
}

class EnumDemo {
   public static void main(String args[]) {
      Apple ap;

      ap = Apple.RedDel;

      System.out.println("Value of ap: " + ap);
      System.out.println();

      ap = Apple.GoldenDel;

      if (ap == Apple.GoldenDel)
         System.out.println("ap contains GoldenDel.\n");

      switch(ap) {
         case GoldenDel:
            System.out.println("Golden Delicious is yellow.");
            break;
         default:
            System.out.println("Everything else is not Golden Delicious");
      }
   }
}