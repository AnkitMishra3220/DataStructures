package com.ankit.ds.arraynew;

public class MaxSumOfKConsecutiveElement {

    public static int maxSumOfKConsecutiveElement(int[] input,int k){

        int maxSum = 0;
        int sum = 0;

        for(int i=0;i<k;i++){
            sum += input[i];
        }
        maxSum = sum;
        for(int i=k;i<input.length;i++){
            sum = sum + input[i] - input[i-k];
            maxSum = Math.max(sum,maxSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {
       int[] input = {1,4,20,3,10,5};
       // int[] input = {7,8,30,-5,20};
        System.out.println(maxSumOfKConsecutiveElement(input,3));


    }
}
