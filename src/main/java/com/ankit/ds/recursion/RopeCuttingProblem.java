package com.ankit.ds.recursion;

public class RopeCuttingProblem {
    //cut a rope in maximum number of pieces such that every piece
    // either as a,b,c
    public static int maxCuts(int ropeLength,int a,int b,int c){
        if(ropeLength==0){
            return 0;
        }
        if(ropeLength <= -1){
            return -1;
        }
        int res = Math.max(maxCuts(ropeLength-a,a,b,c),
                  Math.max(maxCuts(ropeLength-b,a,b,c),
                          maxCuts(ropeLength-c,a,b,c)));

        if(res==-1){
            return -1;
        }
        return res +1;

    }

    public static void main(String[] args) {
        System.out.println(maxCuts(5,3,2,1));
    }
}
