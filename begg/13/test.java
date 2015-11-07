class Gen<T> {
   T ob;

   Gen(T o) {
      ob = o;
   }

   Gen<?>[] make() {
      Gen<?> gen[] = new Gen<?>[10];
      return gen;
   }
}

class test {
   public static void main(String args[]) {
      Gen<Integer> ob = new Gen<>(5);
      Integer arr[] = new Integer[10];
      System.out.println(ob.make());
   }
}