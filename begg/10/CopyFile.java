/* Copy a text file and then writes to it.
   Specificy name of source file and destination file.

   ex: java CopyFile first.txt second.txt
*/

import java.io.*;

class CopyFile {
   public static void main(String args[]) {
      int i;
      FileInputStream fin = null;
      FileOutputStream fout = null;

      if (args.length != 2) {
         System.out.println("Usage: CopyFile from to");
         return;
      }

      try {
         fin = new FileInputStream(args[0]);
         fout = new FileOutputStream(args[1]);

         do {
            i = fin.read();
            if (i != -1) fout.write(i);
         } while (i != -1);
         fout.write((int) 'F');
      } catch (IOException exc) {
         System.out.println("I/O Error: " + exc);
      } finally {
         try {
            if (fin != null) fin.close();
         } catch(IOException exc) {
            System.out.println("Error Closing Input File.");
         }

         try {
            if (fout != null) fout.close();
         } catch(IOException exc) {
            System.out.println("Error Closing Output File.");
         }
      }
   }
}