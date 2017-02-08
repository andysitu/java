class TestRuntime {
	public static void main(String args[]) {
		Runtime now = Runtime.getRuntime();
		long mem = now.freeMemory();
		System.out.println("The free memory available is " + mem);

		long totMem = now.totalMemory();
		System.out.println("The total memory available is " + totMem);

		System.out.println("The difference is " + (totMem - mem));
	}
}