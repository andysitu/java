class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count<10; count++) {
                Thread.sleep(100);
                System.out.println(count);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Exception");
        }

        System.out.println(getName() + " terminating.");
    }
}

class ExtendThread {
    public static void main(STring args[]) {
        System.out.println("Main thread starting.");

        MyThread mt = new MyThread("Child # 1");

        mt.start();

    }
}