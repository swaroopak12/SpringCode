package com.mycode;

import java.util.function.Function;

public class MyFunction {

    public static void main(String[] args) {

        Function<String, Integer> func = x -> x.length();

        Integer apply = func.apply("FunctionExample");   

        System.out.println(apply);

    }

}