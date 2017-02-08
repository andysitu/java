class NewThread extends Thread {
	boolean suspendFlag;

	NewThread(String threadname, ThreadGroup tgOb) {
		super(tgOb, threadname);
		System.out.println("New thread: " + this);
		suspendFlag = false;
		start();
	}

	public void run() {
		try {

		} catch(Exception e) {
			System.out.println("Exception in " + getName());
		}
	}
}

class ThreadGroupDemo {
	public static void main(String args[]) {
		ThreadGroup groupA = new ThreadGroup("Group A");
		ThreadGroup groupB = new ThreadGroup("Group B");
	}
}