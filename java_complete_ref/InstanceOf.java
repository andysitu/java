class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends B {
    int k;
}

class InstanceOf {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A)
            System.out.println("a is instance of A");
        if (c instanceof A) 
            System.out.println("c can be cast to A");
        if (a instanceof C)
            System.out.println("a can be cost to C");

        System.out.println();
        A ob;

        ob = d;
        if(ob instanceof D)
            System.out.println("ob is instance of D");
        System.out.println();

        ob = c;
        if (ob instanceof D)
            System.out.println("ob can be cast to D");

        if (ob instanceof A)
            System.out.println("ob can b cast to A");
    }
}