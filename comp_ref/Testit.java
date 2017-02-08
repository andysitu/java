class MyClass<T, V> {
   T ob1;
   V ob2;

   MyClass(T o1, V o2) {
      ob1 = o1;
      ob2 = o2;
   }

   boolean isSame(MyClass<T, V> o) {
      if (ob1 == o.ob1 && ob2 == o.ob2) return true;
      else return false;
   }
}

class Testit {
   public static void main(String args[]) {
      System.out.println("HI. It's been a while.");

      MyClass<Integer,String> mcOb = new MyClass<>(98, "Hello");

      if(mcOb.isSame(new MyClass<> (98, "Hello"))) System.out.println("They're the same.");
   }
}