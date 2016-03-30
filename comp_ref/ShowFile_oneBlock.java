
import java.io.*;

class ShowFile_oneBlock {
   public static void main(String args[]) {
      int i;
      FileInputStream fin = null;

      if (args.length != 1) {
         System.out.println("Wrong argument given. Need file name.");
         return;
      }

      try {
         fin = new FileInputStream(args[0]);

         do {
            i = fin.read();
            if (i != -1) System.out.print((char) i);
         } while (i != -1);
      } catch(FileNotFoundException e) {
         System.out.println("File not opened correctly.");
      } catch(IOException e) {
         System.out.println("File not read correctly.");
      } finally {
         try {
            if (fin != null) fin.close();
         } catch(IOException e) {
            System.out.println("File not closed correctly.");
         }
      }
   }
}