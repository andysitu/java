enum Transport {
   CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo2 {
   public static void main(String args[]) {
      Transport tp;

      System.out.println("Here are all Transport constants.");

      Transport[] allTransports = Transport.values();

      for(Transport t : allTransports)
         System.out.println(t);

      System.out.println();

      for (Transport t : Transport.values())
         System.out.println(t);

      System.out.println();

      tp = Transport.valueOf("AIRPLANE");
      System.out.println(tp);
   }
}