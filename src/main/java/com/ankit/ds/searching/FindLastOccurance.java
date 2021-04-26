package com.ankit.ds.searching;

public class FindLastOccurance {
    public static int findLastOccurance(int[] input,int k){

        int low = 0;
        int high = input.length-1;

        while (low<=high){
            int mid = (low+high)/2;
            if(k<input[mid]){
                high = mid-1;
            } else if(k>input[mid]){
                low = mid+1;
            }else{
                if(mid==input.length-1||input[mid+1]!=k){
                    return mid;
                }else{
                    low = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arrayOfInts = new int[]{2,3,3,3,4,5,8,8,8,10,11,11,11,13,13};


        System.out.println(findLastOccurance(arrayOfInts,13));

    }
}
