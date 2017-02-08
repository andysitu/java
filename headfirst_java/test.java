import java.util.*;

class O extends P {
    public int number;

    O(int a) {
        number = a;
    }

    int giveMe() {
        System.out.println(number);
        return number;
    }

    void printIt() {
        System.out.println(b);
    }
}

class P {
    private int a = 5;
    int b = 6;
}

class test {
    public static void change(O o, int b) {
        o.number = b;
    }

    public static void main(String args[]) {
        O o = new O(5);
        o.giveMe();
        change(o, 10);
        o.giveMe();

        o.printIt();

        ArrayList aL = new ArrayList();
    }
}