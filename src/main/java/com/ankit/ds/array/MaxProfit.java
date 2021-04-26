package com.ankit.ds.array;

public class MaxProfit {

    public static int maxProfit(int[] input){
        int length = input.length;
        int profit = 0;
        for(int i=1;i<length;i++){
            if(input[i]>input[i-1]){
                profit+=input[i]-input[i-1];
            }

        }
        return profit;
    }

    public static void main(String[] args) {
        int[] input={1,5,3,8,12};
        System.out.println(maxProfit(input));

    }
}
