package com.ankit.ds.recursion;

public class SubSetOfString {
    public static void subSetOfString(String input,String curr,int i){
        if(i == input.length()){
            System.out.print(curr+" ");
            return;
        }
        subSetOfString(input,curr,i+1);
        subSetOfString(input,curr+input.charAt(i),i+1);

    }
    public static void main(String[] args) {
        String str = "Soumya";
        subSetOfString(str,"",0);

    }
}
