class TypeWrap {
   public static void main(String args[]) {
      Integer iOb = new Integer(100);
      System.out.println("Type wrapping value of int: " + iOb.intValue());

      Integer iOb2 = 100;
      int iValue = iOb2;
      System.out.println("Auto-boxed value: " + iValue);
   }
}