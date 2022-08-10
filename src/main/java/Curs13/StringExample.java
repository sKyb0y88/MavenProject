package Curs13;

public class StringExample {

	public static void main(String[] args) {
		transfortToString();
		countWords("Eu invat chineza");
	}

	public static void transfortToString() {

		// char
		char ch = 'a';
		String str = Character.toString(ch);
		String str2 = String.valueOf(ch);

		System.out.println(str.getClass());
		System.out.println(str2.getClass());

		boolean bol = true;
		String str3 = Boolean.toString(bol);
		String str4 = String.valueOf(bol); // sysout

		System.out.println(str3.getClass());
		System.out.println(str4.getClass());

		String str5 = null;
		// System.out.println(str5.toString()); // arunca null pointer
		System.out.println(String.valueOf(str5)); // printeaza null
	}

	public static void countWords(String text) {
		
		String[] words = text.split(" ");
		int nrOfWords = words.length;
		
		System.out.println(nrOfWords);
		System.out.println(String.format("Textul meu contine %d cuvinte!", nrOfWords));

	}
}
