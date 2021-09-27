package com.ankit.ds.arraynew;

public class SubArrayWithGivenSum {
    //Given an unsorted array of non-negative integers. Find if there is a sub-array with given sum
    // This solution wont work for negative numbers (Hasing we can do with O(n))

    // maintain the sliding window of sum
    // compare with sum ()
    // if window sum is greater than sum then remove the element from beginning
    public static boolean findSubArrayWithGivenSum(int[] input,int sum){
        int currSum = input[0];
        int start = 0;
        for(int i=1;i<input.length;i++){

            while (currSum>sum && start<i-1){
                currSum -= input[start];
                start++;
            }
            if(currSum == sum){
                System.out.println("CurrSum:" +currSum);
                return true;
            }
            currSum += input[i];
        }
        return (currSum==sum);


    }

    public static void main(String[] args) {
        int[] input = {1000,4,20,3,10,5};
        System.out.println(findSubArrayWithGivenSum(input,33));

    }

}
