// Using random access files.

import java.io.*;

class RandomAccess {
   public static void main(String args[]) {
      double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
      double d;

      try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw"))
      {
         for (double x: data) {
            raf.writeDouble(x);
         }

         raf.seek(0);
         d = raf.readDouble();
         System.out.println("First double " + d);

         raf.seek(8);
         d = raf.readDouble();
         System.out.println("Second double " + d);

         raf.seek(8 * 3);
         d = raf.readDouble();
         System.out.println("Fourth double " + d);

         System.out.println();

         System.out.println("Every other value:");
         for (int i = 0; i < data.length; i += 2) {
            raf.seek(8 * i);
            d = raf.readDouble();
            System.out.println(d + " ");
         }
      }
      catch(IOException exc) {
         System.out.println("I/O Error: " + exc);
      }
   }
}