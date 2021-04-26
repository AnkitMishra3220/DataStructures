package com.ankit.ds.array;

public class MaximumDifference {

    public static int findMinDifference(int[] input){
        int length = input.length;
        int res =0 ;
        int min = input[0];

        for (int i=1;i<length;i++){
             if(input[i]-min>res){
                 res = input[i]-min;
             }
             if(input[i]<min){
                 min = input[i];
             }
        }

        return res;

    }


    public static void main(String[] args) {
        int[] arrayOfInt = {2,3,10,6,4,8,110};
        System.out.println(findMinDifference(arrayOfInt));
    }
}
