import java.io.*;

class ShowFile {
   public static void main(String args[]) {
      int i;
      FileInputStream fin;


      if (args.length != 1) {
         System.out.println("Wrong argument given. Need file.");
         return;
      }
      try {
         fin = new FileInputStream(args[0]);
      } catch(FileNotFoundException e) {
         System.out.println("Cannot open file");
         return;
      }

      try {
         do {
            i = fin.read();
            if (i != -1) System.out.print((char) i);
         } while (i != -1);
      } catch(IOException e) {
         System.out.println("File read improperly");

      }

      try {
         fin.close();
      } catch(IOException e) {
         System.out.println("File close improperly.");
      }
   }
}