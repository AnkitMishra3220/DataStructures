package com.ankit.ds.array;

// Two pointers Approach --> Array should be sorted

public class CountPairWithNumbers {
    public static void countPairWithNumbers(int[] input,int sum){
        int low = 0;
        int high = input.length-1;

        while (low<high){
            int sumOfNums = input[low]+input[high];
            if(sumOfNums==sum){
                System.out.println("Nums:" +input[low] + ":" + +input[high]);
                low = low +1;
            }else if(sumOfNums>sum){
                high = high-1;
            }else{
                low = low+1;
            }
        }

    }
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,7,8,9,11,12,14,15};

        countPairWithNumbers(input,5);


    }
}
