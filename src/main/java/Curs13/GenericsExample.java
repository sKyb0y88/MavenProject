package Curs13;

public class GenericsExample {

	public static void main(String[] args) {
		
		printDetails(123);
		printDetails("123");
		printDetails(250.5);
		printDetails('n');

	}

	public static <T> void printDetails(T obj) {
		System.out.println("Obiectul meu este: " + obj);
		System.out.println("Data type-ul obiectului este :" + obj.getClass().getName());
	}
/*
	public static void printDetails(String text) {
		System.out.println("obiectul meu este :" + text.getClass());
		
	}
	
	
	*/
}
