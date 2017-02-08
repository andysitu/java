import java.io.*;

class UseTrim {
	public static void main(String args[]) 
		throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		System.out.println("Type in anything.");
		System.out.println("Type stop to exit.");

		do {
			str = br.readLine();
			str = str.trim();
			System.out.println(str);
		} while (!str.equals("stop"));
	}
}