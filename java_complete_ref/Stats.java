
// Bags not implemented in JDK
// import java.util.Scanner;

// public class Stats {
//     public static void main(String[] args) {
//         Bag<Double> numbers = new Bag<Double>();

//         Scanner scanner = new Scanner(System.in);

//         // while (scanner.hasNext())
//         //     numbers.add(scanner.readDouble());
//         // int N = numbers.size();

//         // double sum = 0.0;
//         // for (double x : numbers)
//         //     sum += x;
//         // double mean = sum / N;

//         // sum = 0.0;
//         // for (double X : numbers)
//         //     sum += (X - mean)*(X- mean);
//         // double std = Math.sqrt(sum/(N-1));

//         // System.out.print("Mean: %.2f\n", mean);
//         // System.out.print("Std dev: %.2f\n", std);
//     }
// }

class Tt {
    public int a;
    Tt() {
        a = 5;
        // int b = 5;
    }

    public void increase() {
        a += 1;
    }
}

public class Stats {
    public static void main(String[] args) {
        Tt t = new Tt();
        t.increase();
        System.out.println(t.a);
        // System.out.println(t.b);
        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        // }
    }
}