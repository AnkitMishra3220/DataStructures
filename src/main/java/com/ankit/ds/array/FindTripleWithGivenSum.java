package com.ankit.ds.array;

public class FindTripleWithGivenSum {

    public static void findTripleWithGivenSum(int[] input,int sum){
        int low = 0;
        int high=input.length-1;
        for (int i:input) {
            int diff = sum-i;
            while (low<high) {
                int sumOfPair = input[low]+input[high];
                if (sumOfPair == diff) {
                    System.out.println("Numbers are: " + input[low] + ":" + input[high] + ":" + i);
                    low = low +1;
                } else if (sumOfPair>diff) {
                    high = high - 1;
                } else {
                    low = low + 1;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,7,8,9,11,12,14,15};
        findTripleWithGivenSum(input,7);

    }
}
