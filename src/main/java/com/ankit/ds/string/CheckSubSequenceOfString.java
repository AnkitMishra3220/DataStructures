package com.ankit.ds.string;

public class CheckSubSequenceOfString {

    public static boolean checkSubSequenceOfString(String str1,String str2){
        int str1Length = str1.length();
        int str2Length = str2.length();

        int str1Index = 0;
        int str2Index = 0;

        while (str1Index < str1Length && str2Index < str2Length){
            if(str1.charAt(str1Index) == str2.charAt(str2Index)){
                str1Index++;
                str2Index++;
            }else {
                str1Index++;
            }
            if(str2Index == str2Length-1){
                return true;
            }


        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(checkSubSequenceOfString("geeksforgeeksz","ekx"));




    }
}
