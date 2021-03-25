package com.ankit.ds.recursion;

public class SumOfNaturalNumbers {
    public static int getSum(int number, int k) {
        if (number == 0) {
            return k;
        }
        return getSum(number - 1, number + k);

    }

    public static void main(String[] args) {
        System.out.println(getSum(5, 0));
    }
}