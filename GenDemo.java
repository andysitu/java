class Gen<T> {
   T ob; // object of type T

   Gen(T o) {
      ob = o;
   }

   T getob() {
      return ob;
   }

   void showType() {
      System.out.println("Type of T is " +
                        ob.getClass().getName());
   }
}

class GenDemo {
   public static void main(String args[]) {
      Gen<Integer> iOb;

      // 88 is autobxed to encapsulate 88 within an Integer object.
      iOb = new Gen<Integer>(88);

      iOb.showType();

      int v = iOb.getob(); // auto unboxed
      System.out.println("value: " + v);

      System.out.println();

      Gen<String> strOb = new Gen<String> ("Generics Test");

      strOb.showType();

      String str = strOb.getob();
      System.out.println("value: " + str);

      String strtest = "test";
      System.out.println("TEST " + strtest.getClass().getName());
   }
}