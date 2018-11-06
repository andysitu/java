enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesape(15), Cortland(8);

    private int price;

    Apple(int p) {
        price = p;
    }

    int getPrice() { return price; }
}

class EnumDemo3 {
    public static void main(String args[]) {
        Apple ap;

        System.out.println("Winesape costs " + Apple.Winesape.getPrice());

        System.out.println("All the prices:");
        for(Apple a : Apple.values())
            System.out.println(a + " costs " + a.getPrice)
    }
}