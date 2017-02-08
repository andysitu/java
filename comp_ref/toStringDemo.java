class Box {
	double width, height, depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	public String toString() {
		return "Dimensions are " + width + " by " + depth + " by " + height + ".";
	}
}

class toStringDemo {
	public static void main(String args[]) {
		Box b = new Box(10, 12, 14);
		String s = "Box: " + b;

		System.out.println(b);
		System.out.println(s);
		System.out.println(b.toString());
	}
}