package com.ankit.ds.string;

public class PalindromeCheck {

    public static boolean  palindromeCheck(String input){
        int low = 0;
        int high = input.length()-1;

        while(low<high){
            if(input.charAt(low)!=input.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(palindromeCheck("ABCBA"));

    }
}
