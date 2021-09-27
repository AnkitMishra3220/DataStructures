package com.ankit.ds.array;
/*
   This algo doesnot provide you the first occurrence
 */
public class FindMajorityMooreVoting {

    public static int findMajority(int[] input){
        int count=1;
        int res=0;
        for(int i=1;i<input.length;i++){
            if(input[i]==input[res]){
                count++;
            }else {
                count--;
            }
            if(count==0){
                res = i;
                count = 1;
            }
        }
        return input[res];
    }

    public static void main(String[] args) {
      //  int[] input = {1,4,6,8,9,1,1,1,1,8,9,0,2};
        int[] input1 = {1,4,6,8,9,1,1,1,1,1,1,1,8,9,0,2};
        int[] input = {1,2,5,6,1,7,3,5,1,2,7,13,1,15,1,20,1,21,45,1,99,100,1,101,1,102,1,103,113,1};
       // System.out.println(input1.length);
        System.out.println(findMajority(input));

        StringBuffer sb = new StringBuffer();
        sb.append(1+" ");
        sb.toString().trim();
        Math.max(1,1);
        System.out.println(Integer.max(new Integer(5),new Integer(6)));



    }



}
