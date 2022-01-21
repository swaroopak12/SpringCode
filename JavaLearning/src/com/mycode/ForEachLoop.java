package com.mycode;
import java.util.*;

public class ForEachLoop
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int total = 1;
		for(int number:numbers)
		{
			System.out.println("Number values:  "+number);	
			
			total= total+number;
			System.out.println("Total values:  "+total);
			
		}
		
		
		
	}
}