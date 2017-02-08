import java.io.*;

public class SimpleDotComTest {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int locations[] = {2, 3, 4};

        dot.setLocationCells(locations);

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}

public class SimpleDotCom {
    int[] setLocationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);

        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";

                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.legnth) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}

public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}