package com.ankit.ds.maths;

import java.util.Scanner;

public class NumberOfDigits {

    public static int countDigitsIterative(long num){

        int count = 0;
        while (num !=0){
            num = num/10;
            count++;
        }
        return count;
    }

    public static int countDigitsRecursive(long num){

        if(num == 0){
            return 0;
        }
        return 1+ countDigitsRecursive(num/10);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        int numDigit = countDigitsIterative(num);
        System.out.println("Digit Count Iterative->" +numDigit);

        numDigit = countDigitsRecursive(num);
        System.out.println("Digit Count Recursive-->" +numDigit);


        }
    }
