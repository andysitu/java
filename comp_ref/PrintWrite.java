import java.io.*;

public class PrintWrite {
   public static void main(String args[]) {
      PrintWriter pw = new PrintWriter(System.out, true);

      pw.println("Writing this out with PW");
      int i = -7;
      pw.print(i);
      double d = 4.5e-8;
      pw.println(d);
   }
}