package com.mycode;

public class VarArgs {
	static void display(int n, String... values) 
	{
		System.out.println("n value is: " + n);
		
		for(String str:values)
		{
			System.out.println(str);
		}
	}
	public static void main(String args[]) {
		display(10);
		display(100,"second argument");
		display(200,"two","three arguments");

}
	
}