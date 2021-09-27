package com.ankit.ds.test;

public class CutTheRope {

    public static int cutTheRope(int n,int a,int b,int c){

        if(n==0){
            return 0;
        }

        if(n<0){
            return -1;
        }

        int res = Math.max(Math.max(cutTheRope(n-a,a,b,c),cutTheRope(n-b,a,b,c)),cutTheRope(n-c,a,b,c));
        if(res == -1) return -1;

        return res +1;

    }

    public static void main(String[] args) {

        System.out.println(cutTheRope(5,1,3,2));

    }
}
