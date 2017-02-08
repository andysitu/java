class TestClone implements Cloneable {
	int a;
	double b;

	TestClone(int a1, double b1) {
		a = a1;
		b = b1;
	}

	TestClone cloneTest() {
		try {
			return (TestClone) super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("CLoning not allowed");
			return this;
		}
	}
}

class CloneDemo {
	public static void main(String args[]) {
		TestClone x1 = new TestClone(424, 424.0);
		TestClone x2;

		x2 = x1.cloneTest();

		System.out.println("x1: " + x1.a + ", " + x1.b);
		System.out.println("x2: " + x2.a + ", " + x2.b);
	}
}