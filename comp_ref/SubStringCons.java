class SubStringCons {
	public static void main(String args[]) {
		byte ascii[] = {65, 66, 67, 68, 69, 70};

		String s1 = new String(ascii);
		System.out.println(s1);

		String s2 = new String(ascii, 2, 3);
		System.out.println(s2);

		s2 = new String(ascii, 1, 5);
		System.out.println(s2);
		System.out.println("The length of the string is " + s2.length());

		System.out.println("The length of \"test\" is " + "test".length());
	}
}