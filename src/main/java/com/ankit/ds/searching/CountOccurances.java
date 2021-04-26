package com.ankit.ds.searching;

public class CountOccurances {

    public static int countOccurances(int[] input,int k){

        int firstOccur = FindFirstOccurance.findFirstOccurance(input,k);
        int lastOccur = FindLastOccurance.findLastOccurance(input,k);
        if(firstOccur==-1){
            return -1;
        }
        if(firstOccur==lastOccur){
            return 1;
        }else{
            return lastOccur-firstOccur+1;
        }

    }
    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[]{1,3,4,7,8,9,9,9,9,9,9,9,9,9,10,10,10,11,11,11,16,18,19,20,20,20};
        System.out.println(countOccurances(arrayOfNumbers,0));
    }
}
