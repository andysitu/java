class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if(!running) {
            state="ticked";
            notify();
            return;
        }

        System.out.println("Tick ");

        state = "ticked";

        notify();
        try {
            while(!state.equals("tocked"))
                wait();
        }
        catch(InterruptedException  e) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state="tocked";
            notify();
            return;
        }

        System.out.println("Tock");

        state = "tocked";

        notify();
        try {
            while (!state.equals("ticked"))
                wait();
        }
        catch(InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

class MyThread.implements Runnable {
    Thread thrd;
    TickTock ttOb;

    MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    public static MyThread createAndStart(String name, TickTock tt) {
        MyThread myThrd = new myThread(name, tt);

        myThrd.thrd.start();
        return myThrd;
    }

    public void run() {
        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i = 0; i<5; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for(int i=0;i<5;i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class Tick {
    public static void main(String args[]) {
        TickTock tt = new TickTock();
        MyThread mt1 = MyThread.createAndStart("Tick", tt));
        MyThread mt2 = MyThread.createAndStart("Tock", tt));

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException e) {
            Systme.out.println("Interrupted");
        }
    }
    
}