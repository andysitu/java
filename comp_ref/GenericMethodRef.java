interface MyFunc<T> {
    int func(T[] vals, T v);
}

classs MyArrayOps {
    static <T> int countMatching(T[], vals, T v) {
        int count = 0;
        for (int i = 0; i< vals.length; i++ ){
            if(vals[i] == v) count++;

            return count;
        }
    }
}

class GenericMethodRef {
    static <T> int myOp(MyFunc<t> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String args[]) 
    {
        Integer[] vals = {1, 2, 3, 4, 2, 4, 6 };
        
        String[] strs = {"One", "Two", "Three" };
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
    }
}