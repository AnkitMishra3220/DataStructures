package com.ankit.ds.recursion;

public class SumOfDigits {
    public static int sumOfDigits(int number){
        if(number%10==number){
            return number;
        }
        return number % 10 + sumOfDigits(number/10);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(-657));

    }
}
