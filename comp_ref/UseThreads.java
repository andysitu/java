class MyThread implements Runnable {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " starting");
        try {
            for (int count=0; count < 10; count++) {
                Thread.sleep(100);
                System.out.println(count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " terminating.");
    }
}

class UseThreads {
    public static void main(String args[]) {
        MyThread mt = new MyThread("Child # 1");

        Thread newThread = new Thread(mt);

        newThread.start();

        for(int i = 0; i< 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
                System.out.println("Main Thread slept.");
            } catch(InterruptedException e) {
                System.out.println("Main thread INterrupted.");
            }
        }

        System.out.println("Main Thread terminating.");
    }
}