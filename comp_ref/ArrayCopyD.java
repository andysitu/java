class ArrayCopyD {
	static byte a[] = { 65, 66, 67, 68, 70, 71, 72, 73, 74 };
	static byte b[] = { 77, 77, 77, 77, 77, 77, 77, 77, 77 };

	public static void main(String args[]) {
		System.out.println("a =  " + new String(a));

		byte aCopy[] = new byte[a.length];
		for (int i = 0; i < a.length; i++) {
			aCopy[i] = a[i];
		}

		System.out.println("manual copy of a " + new String(aCopy));
		System.out.println("b = " + new String(b));
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println("a = " + new String(a));
		System.out.println("b = " + new String(b));
		System.arraycopy(a, 0, a, 1, a.length - 1);
		System.arraycopy(b, 1, b, 0, b.length - 1);
		System.out.println("a = " + new String(a));
		System.out.println("b = " + new String(b));

		System.out.println(System.getProperty("user.dir") + System.getProperty("java.specification.vendor"));
	}
}