package com.ankit.ds.java8;

import java.util.Scanner;

public class ScanerInput {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low;i<=high;i++){
            boolean flag = true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
