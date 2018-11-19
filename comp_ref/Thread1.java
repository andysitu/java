class MyThread implements Runnable {
    Thread thrd;
    
    MyThread(String name) {
        thrd = new Thread(this, name);
    }

    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.start();
        return myThrd;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count = 0; count<10; count++) {
                Thread.sleep(100);
                System.out.println(count);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Exception");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class ThreadVariations {
    public static void main(String args[]) {
        MyThread mt = MyThread.createAndStart("child #1");
    }
}