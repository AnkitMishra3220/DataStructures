package com.ankit.ds.recursion;

public class Test {
    public static void main(String[] args) {
        System.out.println(513/10);
    }

    public static int fun(int x,int y){
        if(x==0){
            return y;
        }
        return fun(x-1,x+y);

    }

    public static void print(int n){
        if(n>4000){
            return;
        }
        System.out.println(n);
        System.out.println(2*n);
        System.out.println(n);

    }
}
