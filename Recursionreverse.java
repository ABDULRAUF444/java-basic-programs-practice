package edu.stpeters;

public class Recursionreverse {

	public static void main(String[] args) {
		int n=5;
		printHello(n);
	}

	private static void printHello(int n) {
		if(n!=0) {
			System.out.println("Hello");
			printHello(n-1);
			
			
			
		}

	}

}
