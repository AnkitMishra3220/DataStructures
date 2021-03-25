package com.ankit.ds.recursion;

public class FactorialTrailRecur {
    public static int getFact(int number,int k){
        if(number==1 || number==0){
            return k;
        }
        return getFact(number-1,number*k);

    }
    public static void main(String[] args) {
        System.out.println(getFact(4,1));

    }
}
