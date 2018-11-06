// Reads characters type and counts #
// of spaces

class ReadChar {
   public static void main(String args[]) 
   throws java.io.IOException {
      char ch;
      short counter = 0;
      for ( ; ; ) {
         System.out.println("Type some characters. Type period to end");
         do {
            ch = (char) System.in.read();
            if (ch == ' ')
               counter++;
         } while (ch != '.');
         if (ch == '.')
            break;
      }

      System.out.println("You used space " + counter + " times.");
   }
}