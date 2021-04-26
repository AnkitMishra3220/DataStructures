package com.ankit.ds.array;

public class LeftRotateArrayByOne {

    public static int[] leftRotateArrayByOne(int[] input){
        int length = input.length;
        if(length==0||length==1){
            return input;
        }
        int temp = input[0];
        for(int i=1;i<length;i++){
            input[i-1]=input[i];
        }
        input[length-1]=temp;
        return input;
    }


    public static void main(String[] args) {
        int[] arrayOfInts = {1,2,4,5,8,9};

        int[] res = leftRotateArrayByOne(arrayOfInts);

        for (int i:res) {

            System.out.println(i);

        }


    }
}
