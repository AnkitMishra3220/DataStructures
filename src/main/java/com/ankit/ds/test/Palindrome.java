package com.ankit.ds.test;

public class Palindrome {

    public static boolean checkPalindrome(String input,int start, int end){

        if(start >= end){
            return true;
        }
        if(input.charAt(start) != input.charAt(end)){
            return false;
        }

        return checkPalindrome(input,start+1,end-1);

    }

    public static void main(String[] args) {
        String input = "m";
        System.out.println(checkPalindrome(input,0,input.length()-1));

    }
}
