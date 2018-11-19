import java.util.*;

class MYClass {
    private int val;

    MyClass(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

class UseMethodRef 
{
    static int COmpareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String args[]) {
        ArrayList<MyClass> al = new ArrayList<MyClass>();

        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(5));
        al.add(new MyClass(2));
        al.add(new MyClass(3));
        al.add(new MyClass(9));

        MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);
    }
}