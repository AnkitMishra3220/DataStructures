package com.ankit.ds.array;

public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicate(int[] input){
        if(input.length==0||input.length==1){
            return input.length;
        }
        int j=0;
        for (int i=0;i<input.length-1;i++){
            if(input[i]!=input[i+1]){
                input[j++]=input[i];
            }
        }
        input[j++] = input[input.length-1];
        return j;
    }


    public static void main(String[] args) {

        int[] arrayOfInt = new int[]{2,2,3,4,5,5,5,6,6,7,8,9};

        int lengthOfArray = removeDuplicate(arrayOfInt);

        for (int i=0;i<lengthOfArray;i++){
            System.out.println(arrayOfInt[i]);
        }

    }
}
