package com.ankit.ds.array;

public class CountFrequenciesAllElement {

    public static int[] countFrequencies(int[] input){
        int length = input.length;

        for(int i=0;i<length;i++){
            input[i] = input[i]-1;
        }

        for(int i=0;i<length;i++){
            input[input[i]%length] = input[input[i]%length]+length;
        }
        for(int i=0;i<length;i++){
            input[i] = input[i] / length;
        }

        return input;

    }

    public static void main(String[] args) {
        int[] input = {2,3,3,2,5};
        int[] out = countFrequencies(input);

        for(int i:out){
            System.out.println(i);
        }

    }
}
