package com.ankit.ds.java8;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CalculatorImpl {

    public static void main(String[] args) {
        Calculator calculator = (i1,i2) -> i2-i1;
       // System.out.println(calculator.substract(5,10));

        List<Integer> list = Arrays.asList(1,2,5,6,7,10,10,20,20,21,21);

        list.stream().filter(x -> x%2==0).collect(Collectors.toSet()).stream().sorted().
                forEach(System.out::println); //Assending

        list.stream().filter(x -> x%2==0).collect(Collectors.toSet()).stream().sorted(Comparator.reverseOrder()).
                forEach(System.out::println); //Desc




    }
}
