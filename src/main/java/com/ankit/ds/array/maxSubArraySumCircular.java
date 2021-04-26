package com.ankit.ds.array;

public class maxSubArraySumCircular {

    public static int maxSubArraySumCircular(int[] input){

        int sum = 0 ;
        int minEnding = input[0];
        int minSum = input[0];

        for (int i:input) {
            sum += i;

        }

        for(int i=1;i<input.length;i++){
            minEnding = Math.min((minEnding+input[i]),input[i]);
            minSum = Math.min(minEnding,minSum);
        }

        return sum - minSum;




    }

    public static void main(String[] args) {
        //int[] input = {5,-2,3,4};
        int[] input = {8,-4,3,-5,4};

        System.out.println(maxSubArraySumCircular(input));


    }
}
