package com.mycode;

import java.util.Scanner;

public class Math3 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter side a");
		a = s.nextDouble();
		
		System.out.println("Enter side b");
		b = s.nextDouble();
		
		c= Math.sqrt((a*a) + (b*b));
		System.out.println("Hypotenuse is " + c);
		s.close();

	}

}
