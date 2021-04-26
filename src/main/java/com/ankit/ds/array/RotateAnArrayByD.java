package com.ankit.ds.array;

public class RotateAnArrayByD {

    public static int[] rotateAnArrayByD(int[] input,int d){
        int length = input.length;
        if(length==0||length==1){
            return input;
        }
        reverse(input,0,d-1);
        reverse(input,d,length-1);
        reverse(input,0,length-1);
        return input;

    }

    public static void reverse(int[] input,int low,int high){

        while (low<high){
            int temp=input[low];
            input[low]=input[high];
            input[high]=temp;
            low++;
            high--;
        }

    }

    public static void main(String[] args) {
        int[] arrayOfInts = {1,3,4,6,7,9,10,17};
        rotateAnArrayByD(arrayOfInts,3);
        for (int i:arrayOfInts) {
            System.out.println(i);

        }
    }
}
