package com.ankit.ds.array;
/*
   This algo doesnot provide you the first occurrence
 */
public class FindMajorityMooreVoting {

    public static int findMajority(int[] input){

        int count=1; int res=0;
        for(int i=1;i<input.length;i++){
            if(input[res]==input[i]){
                count++;
            }else {
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }

        }
        return input[res];
    }

    public static void main(String[] args) {
        int[] input = {1,4,6,8,9,1,1,1,1,8,9,0,2};
        int[] input1 = {1,4,6,8,9,1,1,1,1,1,1,1,8,9,0,2};
        System.out.println(input1.length);
        System.out.println(findMajority(input));


    }



}
