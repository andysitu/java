public class NativeDemo {
   int i;
   public static void main(String args[]) {
      NativeDemo ob = new NativeDemo();

      ob.i = 10;
      System.out.println("This is ob.i before running the native method:" + ob.i);
      ob.test();
      System.out.println("This is ob.i after:" + ob.i);
   }

   public native void test() ;

   static {
      System.loadLibrary("NativeDemo");
   }
}