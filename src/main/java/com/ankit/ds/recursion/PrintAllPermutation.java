package com.ankit.ds.recursion;

public class PrintAllPermutation {

    public static void permute(String str,int n){
        if(n==str.length()-1){
            System.out.println(str);
        }
        for(int i=n;i<str.length();i++){
            str = swap(str,n,i);
            permute(str,n+1);
            str = swap(str,i,n);
        }

    }

    public static String swap(String str,int a,int b){
        char temp;
        char[] input = str.toCharArray();
        temp = input[a];
        input[a] = input[b];
        input[b] = temp;
        return String.valueOf(input);

    }

    public static void main(String[] args) {

        String str = "abcd";

        permute(str,0);


    }
}
