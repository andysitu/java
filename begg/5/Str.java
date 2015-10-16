// Testing strings

class Str {
   public static void main(String args[]) {
      String str1 = "Hello";
      String str2 = new String(str1);
      String str3 = new String("Hello");

      boolean eq = str1.equals(str2);
      System.out.println("Does str1 eq to 2? " + eq);
      eq = str1.equals(str3);
      System.out.println("Does str1 eq to 3? " + eq);

      String str4 = "ZGDJKGSJDKGJDSLGJLSD";

      int res = str1.compareTo(str4);
      System.out.println("Compared to str4, str1 is " + res);
   }
}