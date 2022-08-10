package Curs13;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		reverseString("Eu invat java");
		deleteFromString("Eu invat java");
		replaceFromString("Salut Bogdan", 6, 12, "Oana");
		insertIntoString("Salut", 5, "Ion");
		addSpacesToText("thisIsACamelCaseString");
		addSpacesToText2("aaaaaabcccccccccccccccddddddddddddeeee");
		appendToString("Salut ", "George");
	}
	
	//reverse a string
	public static void reverseString(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
		
	}
	
	//delete from string
	public static void deleteFromString(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.delete(2, 6);
		System.out.println(sb);
	}
	
	//replace from string
	public static void replaceFromString(String text, int startIndex, int endIndex, String textToReplace) {
		
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.replace(startIndex, endIndex, textToReplace);
		System.out.println(sb);
	}
	
	//insert into string
	public static void insertIntoString(String text, int index, String textToInsert) {

		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.insert(index, textToInsert);
		System.out.println(sb);
	}
	
	// camelCase --> lowerCamelCase --> metode
	// CamelCase --> UpperCamelCase --> Clase
	
	public static void addSpacesToText (String camelCase) {
		
		StringBuilder sb = new StringBuilder(camelCase);
		System.out.println("Text initial : " + camelCase);
		for(int i = 0; i < sb.length(); i++) {
			if(i!=0 && Character.isUpperCase(sb.charAt(i))) {
				
				sb.insert(i, " ");
				i++;
			} 
		}
		System.out.println(sb);
	}
	
	public static void addSpacesToText2 (String text) {
		
		StringBuilder sb = new StringBuilder(text);
		System.out.println("Text initial : " + text);
		for(int i = 0; i < sb.length(); i++) {
			//if(i!=0 && Character.isUpperCase(sb.charAt(i))) {
			if(i!=0 && sb.charAt(i) == 'b') {	
				sb.insert(i, " ");
				i++;
			} 
		}
		System.out.println(sb);
	}

	//append to string
	public static void appendToString(String text, String textToAppend) {
		
		StringBuilder sb = new StringBuilder(text);
		System.out.println("Text intial: " + sb);
		sb.append(textToAppend);
		System.out.println("Text modificat: " + sb);
	}

}
