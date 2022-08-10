package Curs13;

public class Homework13 {

	public static void main(String[] args) {

		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus,	vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo.Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";

		countWordAppearance(text, "Nulla");
		splitTextToPhrases(text);
		deleteChartAt(text, "a");
		replaceChar(text, "o");
	}

	public static void countWordAppearance(String text, String word) {

		String[] words = text.split(" ");
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (word.equals(words[i]))
				count++;
		}
		System.out.println("Cuvantul " + word + " apare de " + count);
		System.out.println("----------------------------------------------------------");

	}

	public static void splitTextToPhrases(String text) {

		String[] split = text.split("[.]", 0);
		for (String myString : split) {
			System.out.println(myString);
			System.out.println("----------------------------------------------------------");
		}

	}

	public static void deleteChartAt(String text, String character) {

		StringBuilder sb = new StringBuilder(text);
		
		int index = sb.indexOf(character);
		while (index != -1 ) {
			System.out.println("Indexul inainte de delete:" + index);
			sb.deleteCharAt(index);
			index = sb.indexOf(character, index - 1);
			System.out.println("Indexul dupa indexOf si delete:" + index);		
		}
		
		System.out.println("Text after A char has been removed: " + sb.toString());
		System.out.println("----------------------------------------------------------");

	}
	
	public static void replaceChar(String text, String character) {
		
		StringBuilder sb = new StringBuilder(text);
		String replacementChar = "#";
		
		int index = sb.indexOf(character);
		System.out.println("Index of " + character + " inainte de primul replace " + index);
		while (index != -1 ) {
			sb = sb.replace(sb.indexOf(character), sb.indexOf(character) + character.length(), replacementChar);
			index = sb.indexOf(character, index + 1);
			System.out.println("Index of " + character + " dupa replace " + index);
		}
		
		System.out.println("Text after O char has been replaced with #: " + sb);
		System.out.println("----------------------------------------------------------");
		
		
		
		
	}
}