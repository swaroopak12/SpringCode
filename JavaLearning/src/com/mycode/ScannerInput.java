package com.mycode;
import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Whats's your favourite color?");
		//takes input from System.in
		String color = s.nextLine();
		
		System.out.println("What's your age");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("Which is your favourite food?");
		String food = s.nextLine();
		
		System.out.println("I like " + color);
		System.out.println("I am "+ age + " years old");
		System.out.println("I like " + food);
	}

}
