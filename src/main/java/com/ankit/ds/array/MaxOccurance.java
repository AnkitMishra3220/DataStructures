package com.ankit.ds.array;

public class MaxOccurance {

    public static int maxOccured(int L[], int R[], int n, int maxx){
        int[] arr = new int[1000000];
        for(int i=0;i<n;i++){
            arr[L[i]] += 1;
            arr[R[i]+1] -=1;
        }
        int ind = 0;
        int nsum = arr[0];
        for(int i=1;i<maxx+1;i++){
            arr[i] += arr[i-1];
            if(arr[i] > nsum ){
                nsum = arr[i];
                ind = i ;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        int L[] = {1,5,9,13,21};
        int R[] = {15,8,12,20,30};

        System.out.println("Max Occur -> " +maxOccured(L,R,5,30));
    }
}
