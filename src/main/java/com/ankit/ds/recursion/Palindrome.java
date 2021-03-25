package com.ankit.ds.recursion;

public class Palindrome {
    public static boolean isPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        return ((str.charAt(start) == str.charAt(end)) && isPalindrome(str,start+1,end-1));
    }

    public static void main(String[] args) {
        String input = "AnkknA";
        System.out.println(input.length());
        System.out.println(isPalindrome(input,0,input.length()-1));
    }
}
