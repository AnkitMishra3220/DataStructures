package com.ankit.ds.array;

public class MoveZeroToEnd {
    
    public static int[] moveZeroToEnd(int[] input){
        
        int count =0;

        for (int i=0;i<input.length;i++) {
            if(input[i]!=0){
                int temp = input[count];
                input[count]=input[i];
                input[i]=temp;
                count++;
            }
        }

        return input;
        
    }

    public static void main(String[] args) {

        int[] input = new int[]{0,2,0,0,3,5,0,9,0,0};


        int[] out = moveZeroToEnd(input);

        for (int i:out){
            System.out.println(i);
        }
        
    }
}
