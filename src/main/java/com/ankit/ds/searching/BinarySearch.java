package com.ankit.ds.searching;

public class BinarySearch {

    public static int search(int[] input,int k){

        int low = 0;
        int high= input.length-1;

        while (low <=high){
            int mid = (low+high)/2;

            if(input[mid]==k){
                return mid;
            }else if(k<input[mid]){
                high = mid-1;

            }else {
                low = mid +1;
            }

        }
        return -1;
    }

    public static int searchRec(int[] input,int low,int high,int k){

        int mid = (low+high)/2;

        if(input[mid]==k){
            return mid;
        }

        if (k < input[mid]){
            return searchRec(input,low,mid-1,k);
        } else {
            return searchRec(input,mid+1,high,k);
        }

    }

    public static void main(String[] args) {
        int[] arrayOfInt = new int[]{3,6,8,9,10,15,17,22};

        System.out.println(search(arrayOfInt,15));

        System.out.println(searchRec(arrayOfInt,0,arrayOfInt.length-1,15));
    }
}
