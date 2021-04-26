package com.ankit.ds.array;

public class MaximumSubArray {

    public static int maxSubArraySum(int[] input){

        int maxEnding = input[0];
        int maxSum=input[0];

        for (int i=1;i<input.length;i++){
           maxEnding = Math.max((maxEnding+input[i]),input[i]);
           maxSum = Math.max(maxSum,maxEnding);

        }

        return maxSum;

    }

    public static void main(String[] args) {
       // int[] input = {-5,1,-2,3,-1,2,-2};
        int[] input = {-3,8,-2,4,-5,6};

        System.out.println(maxSubArraySum(input));
    }
}
