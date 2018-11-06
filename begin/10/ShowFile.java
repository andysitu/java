import java.io.*;

class ShowFile {
   public static void main(String args[]) {
      int i;
      FileInputStream fin;

      if (args.length != 1) {
         System.out.println("Usage: ShowFile File");
         return;
      }

      try { // read file
         fin = new FileInputStream(args[0]);
      } catch(FileNotFoundException exc) {
         System.out.println("File Not Found");
         return;
      }

      try {
         do {
            i = fin.read();
            if (i != -1) System.out.print( (char) i );
         } while (i != -1);
      } catch(IOException exc) {
         System.out.println("Error reading File");
      } finally {
         try {
            fin.close();
         } catch(IOException exc) {
            System.out.println("Error closing file.");
         }
      }
   }
}