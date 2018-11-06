package bookpackext;

class UseBook {
   public static void main(String args[]) {
      bookpack.Book books[] = new bookpack.Book[3];

      books[0] = new bookpack.Book("Java: A Beginner's Guide",
         "Schildt", 2014);
      books[1] = new bookpack.Book("Books", "ME", 2050);
      books[2] = new bookpack.Book("Bookit", "Whothis", 2999);

      for (int i = 0, len = books.length; i < len; i++) {
         books[i].show();
      }
   }
}