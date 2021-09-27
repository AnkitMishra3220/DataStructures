package com.ankit.ds.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] input){

        for(int i=0;i<input.length-1;i++){
            int min = input[i];
            int k = i;
            for (int j=i;j<input.length-1;j++){
                if(min > input[j+1]){
                    min = input[j+1];
                    k = j+1;
                }
            }
            int temp = input[i];
            input[i] = min;
            input[k] = temp;
        }
        return input;

    }

    public static void main(String[] args) {
        int[] input = {1,56,2,67,8,229,78,2772,1,23};
        Arrays.stream(selectionSort(input)).forEach(System.out::println);
    }
}
