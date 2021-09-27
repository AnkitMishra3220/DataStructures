package com.ankit.ds.tree;

public class CharArray {
    // aaabba
    public static char[] countChars(char[] input){
        int count = 0;
        int k = 0;
        for(int i=1;i<input.length;i++){
            if(input[i-1]==input[i]){
                count++;
            }else{
                input[k] = input[i-1];
                k= k+1;
                System.out.println("Test:" +count);
                input[k] = (char)count;
                k=k+1;
                count = 0 ;
            }


        }

        return input;

    }

    public static void main(String[] args) {
        char[] chars = {'a','a','a','b','b','a'};
        char[] out = countChars(chars);
        for(int i=0;i<out.length;i++){
            System.out.println(out[i]);
            int u = out[i];
            System.out.println(u);
        }
    }


}
