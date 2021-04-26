package com.ankit.ds.array;

public class MaxConsecutiveOne {
    public static int maxConsecutiveOne(int[] input){
        int length = input.length;
        int count = 0;
        int maxCount=0;

        for(int i=0;i<length;i++){
            if(input[i]==0){
                if(count>maxCount){
                    maxCount = count;
                }
                count=0;
            }else{
                count++;
            }
        }

        return maxCount;


    }

    public static void main(String[] args) {
        int[] input = {0,0,1,1,0,0,0,1,1,1,1,0,1,1,1,1,1,0};

        System.out.println(maxConsecutiveOne(input));
    }
}
