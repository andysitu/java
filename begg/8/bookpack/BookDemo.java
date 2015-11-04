package bookpack;

class BookDemo {
   public static void main(String args[]) {
      Book books[] = new Book[3];

      books[0] = new Book("Java: A Beginner's Guide",
         "Schildt", 2014);
      books[1] = new Book("Books", "ME", 2050);
      books[2] = new Book("Bookit", "Whothis", 2999);

      for (int i = 0, len = books.length; i < len; i++) {
         books[i].show();
      }
   }
}