package com.ankit.ds.sorting;

/*
   Execute the loop n-1 times
 */


public class BubbleSort {
    public static int[] bubbleSort(int[] input){

        for(int i=1;i<=input.length-1;i++){
            for(int k=0;k<input.length-i;k++){
                if(input[k]>input[k+1]){
                    int temp = input[k];
                    input[k] = input[k+1];
                    input[k+1] = temp;
                }

            }

        }

        return input;

    }

    public static void main(String[] args) {
        int[] input = new int[]{101,39,45,98};
        int[] output = bubbleSort(input);

        for (int i:output) {
            System.out.println(" " +i);
        }

        System.out.println();


    }
}
