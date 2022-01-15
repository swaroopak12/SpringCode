package com.mycode;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String args[]) {
    List<Integer> listOfInt = Arrays.asList(1,2,3,4,5,6,7,8,9);
    
    System.out.println("Printing the whole list : ");
    
    //Pass n as parameter
    eval(listOfInt, n-> true);
    System.out.println("Printing even numbers : ");
    eval(listOfInt, n-> n%2 == 0);
    }
    
     public static void eval(List<Integer> listOfInt, Predicate<Integer> predicate)
     {
         for(Integer n : listOfInt)
         {
             if(predicate.test(n)){
                 System.out.println(n + " ");
             }
         }
     }
}