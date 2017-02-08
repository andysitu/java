class StringReplace2 {
	public static void main(String args[]) {
		String org = "This is a test. This is, too";
		String search = "is";
		String sub = "was";

		System.out.println(org);
		org = org.replace(search, sub);
		System.out.println(org);
	}
}