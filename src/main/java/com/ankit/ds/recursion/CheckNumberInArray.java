package com.ankit.ds.recursion;

public class CheckNumberInArray {

    static boolean checkNumber(int[] input,int start,int length,int num){
        if (input[start] == num){
            return true;
        }
        if(start == length){
                return false;
        }
            return checkNumber(input,start+1,length,num);

    }


    public static void main(String[] args) {
        int[] input = {1,4,6,8,9};

        System.out.println(checkNumber(input,0,input.length-1,4));

    }
}
