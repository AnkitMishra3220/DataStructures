package com.ankit.ds.test;

public class GenerateSubset {

    public static void generateSubset(String input,String curr,int i){

        if(i == input.length()){
            System.out.println(curr);
            return ;
        }

        generateSubset(input,curr,i+1);
        generateSubset(input,curr+String.valueOf(input.charAt(i)),i+1);

    }

    public static void main(String[] args) {

        String input = "abc";

        generateSubset(input,"",0);



    }
}
