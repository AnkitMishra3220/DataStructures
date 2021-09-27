package com.ankit.ds.arraynew;

public class EquilibriumPoint {

    public static boolean isEqPoint(int arr[]){
        int sum = 0;
        int leftSum = 0;
        for (int i:arr) {
            sum += i;
        }

        for(int i=0;i<arr.length;i++){
            if(leftSum == sum-arr[i]){
                return true;
            }
            sum -= arr[i];
            leftSum += arr[i];
        }
        return false;
    }

    public static void main(String[] args) {

        int[] input = {4,2,-2};
        System.out.println(isEqPoint(input));

    }
}
