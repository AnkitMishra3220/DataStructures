package com.ankit.ds.recursion;

public class BinaryNumber {
    public static void getBinaryNumber(int n){

        if(n==0){
            return;
        }
        getBinaryNumber(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        getBinaryNumber(10);
    }
}
