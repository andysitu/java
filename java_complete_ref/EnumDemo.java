enum Apple {
    Jonathan, GoldenDel, RedDel, Winesape, Cortland
}

class EnumDemo {
    public static void main(String args[]) {
        Apple ap;

        ap = Apple.RedDel;

        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        switch(ap) {
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
        }
    }
}