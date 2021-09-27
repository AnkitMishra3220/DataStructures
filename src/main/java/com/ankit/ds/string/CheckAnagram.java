package com.ankit.ds.string;

public class CheckAnagram {

    public static boolean checkAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] count = new int[256];

        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "aabccd";
        String s2 = "ccdaab";

        System.out.println(checkAnagram(s1,s2));

    }
}
