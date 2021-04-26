package com.ankit.ds.array;

public class LeaderInAnArray {

    //Kadan
    public static void findLeaderInAnArray(int[] input){
        int length=input.length;
        int max = 0;
        System.out.println(input[length-1]);
        for (int i=length-1;i>0;i--){
            if(input[i]>max){
                max=input[i];
            }
            if(input[i-1]>max){
                System.out.println(input[i-1]);

            }

        }

    }

    public static void main(String[] args) {
        int[] arrayOfInt = {7,10,4,10,6,5,2};
        findLeaderInAnArray(arrayOfInt);

    }
}
