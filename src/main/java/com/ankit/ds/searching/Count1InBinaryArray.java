package com.ankit.ds.searching;

public class Count1InBinaryArray {
    public static int count1InBinaryArray(int[] binaryArray){
        int index = FindLastOccurance.findLastOccurance(binaryArray,0);
        return binaryArray.length - index -1;

    }

    public static void main(String[] args) {
        int[] binaryArray = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};
        System.out.println(count1InBinaryArray(binaryArray));

    }
}
