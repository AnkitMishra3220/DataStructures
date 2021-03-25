package com.ankit.ds.recursion;

public class Factorial {
    public static int getFact(int number){
        if(number<=1){
            return 1;
        }
        return number*getFact(number-1);
    }

    public static void main(String[] args) {
        System.out.println(getFact(4));
    }
}
