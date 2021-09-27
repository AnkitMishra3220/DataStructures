package com.ankit.ds.string;

public class FindFrequencyInSortedOrder {

    public static void findFrequencyInSortedOrder(String input){
        int[] arrayOfFrequencies = new int[26];

        for(int i=0;i<input.length();i++){
            arrayOfFrequencies[input.charAt(i)-'a']++;
        }

        for (int i=0;i<26;i++){
            char c = (char) (i + 'a');
            if(arrayOfFrequencies[i]!=0) {
                System.out.println("Char: " + c + " Frequency: " + arrayOfFrequencies[i]);
            }
        }
    }

    public static void main(String[] args) {
        findFrequencyInSortedOrder("tututututara");
    }
}
