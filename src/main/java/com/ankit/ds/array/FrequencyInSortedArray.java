package com.ankit.ds.array;

public class FrequencyInSortedArray {

    public static void findFrquency(int[] input){
        int count = 1;
        int i = 1;

        while (i<input.length){
            if(input[i-1]==input[i]){
                count++;
            }else {
                System.out.println("Array Element :" +input[i-1] +" Count :" +count);
                count=1;
            }
            i++;
        }

        if(input[i-1]==input[i-2]){
            System.out.println("Array Element :" +input[i-1] + " Count :" +count);
        }else {
            System.out.println("Array Element :" +input[i-1] + " Count :" +1);
        }

    }

    public static void main(String[] args) {
        int[] arrayOfInt = {2,3,3,3,4,4,5,6,7,8,8,9,9,9,10,10};
        findFrquency(arrayOfInt);

    }
}
