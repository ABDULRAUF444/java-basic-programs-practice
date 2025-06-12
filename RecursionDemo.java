package edu.stpeters;

public class RecursionDemo {

	public static void main(String[] args) {
	//n
		//1 2 3...n
		int n=120;
		int res=factorial(n);
		System.out.println(res);

	}

	private static int factorial(int n) {
		return n>1 ?n*factorial(n-1):1;
	
	}

}
