package Curs13;

public class VarargsExample {

	public static void main(String[] args) {
	
		printStringArguments(1, 'c', "One ", "two", "three", "four", "five");
		//printStringArguments(1, 2, 3);
		printStringArguments(1, 'c', "a", "b", "c", "d");
		
		printArguments("A", "B", "C");
		printArguments('c', 350.6, "text", 32);
		printArguments("V", 234, 3456, 'c', "3456");

	}
	
	
	public static void printStringArguments(int num, char c, String...values) {
		
		for( String value : values) {
			System.out.println(value);
		}
	}
	
	public static <T> void printArguments(T...values) {
		
		for(T value : values) {
			System.out.println(value);
		}
		
	}
/*	
	public static void printStringArguments(String str1, String str2, String str3) {
		
		System.out.println(str1 + " " + str2 + " " + str3);
	}	

	public static void printStringArguments(int num1, int num2, int num3) {
		
		System.out.println(num1 + " " + num2 + " " + num3);
	}	
	
	*/
		
}
