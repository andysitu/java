import java.io.*;
import java.net.*;

public class DailyAdviceServer {

   String[] AdviceList = {
      "Take smaller bites", "Question everything", "Decide and then act",
      "Think of today", "One step at a time", "Be honest with yourself",
      "For most of your decisions, do what you want to do, not should",
      "Your feelings right now follow your thoughts, not the other way around"
   };

   public void go() {

      try {
         ServerSocket serverSock = new ServerSocket(4242);

         while(true) {

            Socket sock = serverSock.accept();

            PrintWriter writer = new PrintWriter(sock.getOutputStream());
            String advice = getAdvice();
            writer.println(advice);
            writer.close();
            System.out.print("I was asked for advice. I gave: ");
            System.out.println(advice);
         }
      } catch(IOException ex) {
         ex.printStackTrace();
      }
   }

   private String getAdvice() {
      int random = (int) (Math.random() * AdviceList.length);
      return AdviceList[random];
   }

   public static void main(String args[]) {
      DailyAdviceServer server = new DailyAdviceServer();
      server.go();
   }
}