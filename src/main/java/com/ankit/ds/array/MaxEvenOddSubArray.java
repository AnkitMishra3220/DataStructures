package com.ankit.ds.array;

public class MaxEvenOddSubArray {

    public static int findMaxEvenOddSubArray(int[] input){
        int length = input.length;
        int count = 1;
        int res = 1;
        for(int i=1;i<length;i++){
            if((input[i-1]%2==0 && input[i]%2!=0) || (input[i-1]%2!=0 && input[i]%2==0)){
                count++;
                res = Math.max(count,res);

            }else{
                count = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arrayOfInt = {5,10,20,6,3,8};

        System.out.println(findMaxEvenOddSubArray(arrayOfInt));

    }
}
