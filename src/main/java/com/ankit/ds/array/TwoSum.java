package com.ankit.ds.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    // You may assume that each input would have exactly one solution, and you may not use the same element twice.

    // You can return the answer in any order.

    public static int[] twoSum(int[] nums, int target) {

        int index1 = -1;
        for (int num : nums) {
            index1++;
            int checkNum = target - num;
            for (int i = index1 + 1; i < nums.length; i++) {
                if (checkNum == nums[i]) {
                    int[] result = new int[]{index1, i};
                    return result;
                }
            }
        }
        int[] result = new int[]{-1, -1};
        return result;
    }

    public static int[] twoSumOpt(int[] nums,int target){

        Map<Integer,Integer> mapOfInts = new HashMap<Integer,Integer>();
        int i = 0;
        for(int num:nums){
            int diff=target-num;
            if(mapOfInts.containsKey(diff)){
                return new int[]{mapOfInts.get(diff),i};
            }
            mapOfInts.put(nums[i],i);
            i++;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

      //  int[] intArray = new int[]{2, 7, 11, 15};
        int[] intArray = new int[]{3,2,4};
        int[] resArray = twoSumOpt(intArray, 6);

        for (int index : resArray) {
            System.out.println(index);

        }

    }
}
