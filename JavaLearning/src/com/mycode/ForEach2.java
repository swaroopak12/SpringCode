package com.mycode;

import java.util.ArrayList;
//import java.util.List;

public class ForEach2 {
	static void display(String... values) {
		System.out.println("display method invoked");
		for(String s4:values)
		{
			System.out.println(s4);
		}
	}
	public static void main(String args[]) {
	ArrayList<String> aryList = new ArrayList<String>();
	//List<Integer> inList = new ArrayList<Integer>();
	aryList.add("S1");
	aryList.add("S2");
	aryList.add("S3");
	for(String S:aryList)
	System.out.println(S);
	display();
	display("one argument");
	display("two","arguments");
	display("one","two","three arguments");

}
	
}