interface MyNumber {
   double getValue();
}

class LambdaDemo {
   public static void main(String args[]) {
      MyNumber myNum;

      myNum = () -> 123.45;

      System.out.println("A fixed number: " + myNum.getValue());

      myNum = () -> Math.random() * 100;
      System.out.println("Random number: " + myNum.getValue());
      System.out.println("Another random number: " + myNum.getValue());
   }
}