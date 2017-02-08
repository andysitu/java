class MemoryDemo {
	public static void main(String args[]) {
		Runtime r = Runtime.getRuntime();
		long mem1, mem2;
		Integer ints[] = new Integer[1000];

		System.out.println("Total memory is " + 
							r.totalMemory());

		mem1 = r.freeMemory();
		System.out.println("Free memory now is " + mem1);
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("Memory after garbage collection is " + mem1);

		for(int i = 0; i<1000; i++) {
			ints[i] = new Integer(i);

		}

		mem2 = r.freeMemory();
		System.out.println("Free memory after allocation is " +
							mem2);
		System.out.println("Memory used by allocation " + (mem1-mem2));

		for(int i = 0; i<1000; i++)
			ints[i] = null;

		r.gc();

		mem2 = r.freeMemory();
		System.out.println("Free memory after discarding integers " + 
							"and gc is " + mem2);
	}
}