import java.io.*;
import java.net.*;

public class DailyAdviceServer {
    String[] adviceList = {"Walk, Don't Run. But Run also", "Tuesdays is after Mondays", "Good slogans are hard to come by",
                        "A dollar is made up of 100 cents", "The value of time becomes more apparent when we're out of it",
                        "What matters to you is stuff related to you", "5 minutes of exercise every day is better than nothing"};

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);

            while(true) {
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}