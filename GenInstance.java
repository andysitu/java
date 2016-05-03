class Gen<T> {
   T ob;

   Gen(T o) {
      ob = o;
   }

   T getob() {
      return ob;
   }
}

class Gen2<T> extends Gen<T> {
   Gen2(T o) {
      super(o);
   }
}

class GenInstance {
   public static void main(String args[]) {
      Gen<Integer> iOb = new Gen<Integer>(100);

      Gen2<Integer> iOb2 = new Gen2<Integer>(99);

      Gen2<String> strOb2 = new Gen2<String>("Testing Generics");

      if(iOb2 instanceof Gen2<?>)
         System.out.println("iOb2 is an instance of Gen2");

      if(iOb2 instanceof Gen<?>)
         System.out.println("iOb2 is an instance of Gen");

      System.out.println();

      if(strOb2 instanceof Gen2<?>)
         System.out.println("strOb2 is an instance of Gen2");

      if(strOb2 instanceof Gen<?>)
         System.out.println("strOb2 is an instance of Gen");

      System.out.println();

      if(iOb instanceof Gen2<?>)
         System.out.println("iOb is an instance of Gen2");

      if(iOb instanceof Gen<?>)
         System.out.println("iOb is an instance of Gen");
   }   
}