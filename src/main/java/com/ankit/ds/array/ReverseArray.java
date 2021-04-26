package com.ankit.ds.array;

public class ReverseArray {

    public static int[] resverseArray(int[] input){

        int low = 0;
        int high = input.length-1;

        while (low<high){
            int temp = input[low];
            input[low]=input[high];
            input[high]=temp;
            low++;
            high--;
        }

        return input;
    }

    public static void main(String[] args) {
        int[] arrayOfInt = new int[]{30,7,6,5,10};

        resverseArray(arrayOfInt);
        for (int i:arrayOfInt) {
            System.out.println(i);

        }


    }
}
