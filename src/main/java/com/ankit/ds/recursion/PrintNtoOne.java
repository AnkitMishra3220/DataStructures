package com.ankit.ds.recursion;

public class PrintNtoOne {
    public static void printNToOne(int number){

        if(number==0){
            return;
        }

        printNToOne(number-1);
        System.out.print(number);

    }

    public static void main(String[] args) {
        printNToOne(64);
    }

}
