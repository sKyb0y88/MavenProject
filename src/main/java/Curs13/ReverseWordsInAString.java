package Curs13;

public class ReverseWordsInAString {

	public static void main(String[] args) {

		ReverseWordsInAString obj = new ReverseWordsInAString();

		obj.reverseWordsInMyString("Welcome to Java");
		obj.reverseWordsInMyString("This is an easy java program");
		
		System.out.println("-------------------------------------------------------------------------------");
		
		obj.reverseWordsInMyStringWithStringBuilder("Welcome to Java");
		obj.reverseWordsInMyStringWithStringBuilder("This is an easy java program");

	}

	public void reverseWordsInMyString(String str) {

		String[] words = str.split(" ");
		String reversedString = "";

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			String reversedWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {

				reversedWord = reversedWord + word.charAt(j);
			}

			reversedString = reversedString + reversedWord + " ";
		}

		System.out.println(str);
		System.out.println(reversedString);
	}

	public void reverseWordsInMyStringWithStringBuilder(String str) {

		StringBuilder reversedString = new StringBuilder();
		String[] words = str.split(" ");

		for (String word : words) {
			
			String reverseWord = new StringBuilder(word).reverse().toString();
			reversedString.append(reverseWord + " ");
		}

		System.out.println(reversedString.toString());
	}

}
