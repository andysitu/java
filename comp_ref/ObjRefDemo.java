interface MyFunc<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp;

    HighTemp(int ht) { hTemp = ht; }
    
    boolean SamTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

class ObjRefDemo {
    static <T> counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) count++;
        }
    }

    public static void main(String args[]) {
        int count;

        HighTemp[] weekDayHighs = {
            new HighTemp(89), new HighTemp(82),
            new HighTemp(90), new HighTemp(89),
        };

        count = counter(WeekDayHighs, HighTemp::samTemp, new HighTemp(89));
    }
}