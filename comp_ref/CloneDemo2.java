class TestClone implements Cloneable {
	int a;
	double b;

	TestClone(int a1, double b1) {
		a = a1;
		b = b1;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("Cloning not supported.");
			return this;
		}
	}
}

class CloneDemo2 {
	public static void main(String args[]) {
		TestClone x1 = new TestClone(424, 112.424);
		TestClone x2;

		x2 = (TestClone) x1.clone();

		System.out.println("x1: " + x1.a + ", " + x1.b);
		System.out.println("x2: " + x2.a + ", " + x2.b);
	}
}