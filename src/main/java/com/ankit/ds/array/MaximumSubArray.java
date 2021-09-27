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

    public static int kadaneSubArraySum(int[] input){
        int csum = input[0];
        int osum = input[0];

        for (int i=1;i<input.length;i++){
            if(csum >=0){
                csum += input[i];
            }else {
                csum = input[i];
            }

            if(csum > osum){
                osum = csum;
            }

        }

        return osum;

    }

    public static void main(String[] args) {
       // int[] input = {-5,1,-2,3,-1,2,-2};
        int[] input = {-3,8,-2,4,-5,6};

        System.out.println(maxSubArraySum(input));
        System.out.println(kadaneSubArraySum(input));
    }
}
