class Super {
   int a;
   int b = 5;
   Super(int a) {
      this.a = a;
   }
}

class Duper extends Super {
   int b;
   Duper(int d, int b) {
      super(d);
      this.b = b;
      a = 4242;
   }
}

class test_ref_change {
   public static void main(String args[]) {
      Super sup = new Super(10);
      sup = new Duper(99, 100);
      System.out.println(sup.a);
      System.out.println(sup.b);
      //System.out.println(sup.b);

      Duper test = new Duper(999, 9999);
      //test = new Super(50);
      test = new Duper(99999, 99994);
   }
}