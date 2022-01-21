package com.mycode;

import java.util.Scanner;

public class AssertJ5 {
	public static void main(String args[])
	{
		/*int val = 14;
		assert val>=20:" Value is not valid";
		System.out.println("The given value is: "+ val);

		String str = "swaroopa";
        assert (str != null);
        System.out.println(str.charAt(0));
		@SuppressWarnings("resource")*/
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number");
		int i = scan.nextInt();
		assert i>=18:"Not Valid";
		System.out.println("Value of i is: " + i);
		scan.close();
		
	}
}
