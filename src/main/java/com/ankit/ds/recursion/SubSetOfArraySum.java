package com.ankit.ds.recursion;

public class SubSetOfArraySum {

    public static int countSumSubset(int[] input,int n,int sum){

        if(n==0){
            return (sum==0)?1:0;
        }

        return countSumSubset(input,n-1,sum) +
                countSumSubset(input,n-1,sum-input[n-1]);

    }


    public static void main(String[] args) {

        int[] input = {1,2,4,5,8,9,15};

        System.out.println(countSumSubset(input,input.length,6));

    }
}
