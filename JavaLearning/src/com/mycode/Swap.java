package com.mycode;

public class Swap {

	public static void main(String[] args) {

		String x = "water";
		String y = "Juice";
		String temp = null;
		
	    temp = x;
	    x = y;
	    y = temp;
	    System.out.println("Water in X is replaced with " + x);
	    System.out.println("Juice in Y is replaced with " + y);
	}

}
