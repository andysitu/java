class Elapsed {
	public static void main(String args[]) {
		long start, end;

		System.out.println("Timing a form loop from 0 to 100,00,000");

		start = System.currentTimeMillis();
		for (long i = 0; i < 100000000; i++) ;
		end = System.currentTimeMillis();

		System.out.println("Time elapsed: " + (end - start));

		start = System.nanoTime();
		for (long i = 0; i < 100000000; i++) ;
		end = System.nanoTime();

		System.out.println("Time elapsed in nano: " + (end - start));
	}
}