package com.ankit.ds.array;

import java.util.ArrayList;
import java.util.List;

public class ReverseAnArrayInGroup {

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {

        for(int i=0;i<n;i+=k){
            int left = i;
            int right = Integer.min(i+k-1,n-1);
            while(left<right){
                int temp = arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);
                left++;
                right--;
            }

        }

    }

    public static void main(String[] args) {

        List<Integer> listOfInt = new ArrayList<>();
        listOfInt.add(1);
        listOfInt.add(2);
        listOfInt.add(3);
        listOfInt.add(4);
        listOfInt.add(5);

        reverseInGroups((ArrayList<Integer>) listOfInt,5,3);

        for (int i: listOfInt) {
            System.out.println(i);

        }



    }
}
