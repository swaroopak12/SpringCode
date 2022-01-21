package com.mycode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class eg {

	public static void main(String args[])
	{
		List<Integer> listOfNum = Arrays.asList(1,2,3,4,5,6,7,8,9);
		//printing list values
		prnt(listOfNum, n-> true);
		//print even numbers
		prnt(listOfNum,n-> n%2 == 0);
	}
		public static void prnt(List<Integer> listOfNum, Predicate<Integer> predicate)
		{
			for(Integer n: listOfNum) {
				if(predicate.test(n))
					System.out.println("n: " + n);
			}
			
		}
	}
