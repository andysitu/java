class GetChar {
	public static void main(String args[]) {
		String s = "Testing one two three";

		int start = 10;
		int end = 14;
		char buf[] = new char[end - start];
		System.out.println("buf[] is now char arr length of " + buf.length);

		s.getChars(start, end, buf, 0);
		System.out.println(buf);
	}
}