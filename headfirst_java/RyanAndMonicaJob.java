class BankAccount {
   private int balance = 100;

   public int getBalance() {
      return balance;
   }

   public void withdraw(int amount) {
      balance -= amount;
   }
}

public class RyanAndMonicaJob implements Runnable{
   private BankAccount account = new BankAccount();

   public static void main(String args[]) {
      RyanAndMonicaJob theJob = new RyanAndMonicaJob();
      Thread one = new Thread(theJob);
      Thread two = new Thread(theJob);
      one.setName("Ryan");
      two.setName("Monica");
      one.start();
      two.start();
   }

   public void run() {
      for (int x = 0; x < 10; x++) {
         makeWithdrawal(10);
         if(account.getBalance() < 0) {
            System.out.println("Overdrawn");
         }
      }
   }

   private synchronized void makeWithdrawal(int amount) {
      String name = Thread.currentThread().getName();

      if (account.getBalance() >= amount) {
         System.out.println(name + " is about to withdraw");
         try {
            System.out.println(name + " is going to sleep");
            Thread.sleep(500);
         } catch(InterruptedException ex) {
            ex.printStackTrace();
         }

         System.out.println(name + " woke up");
         account.withdraw(amount);
         System.out.println(name + " completes the withdrawl");
      } else {
         System.out.println("Not enough balance for " + name);
      }
   }
}