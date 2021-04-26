package com.ankit.ds.searching;

public class SquareRoot {

    public static int findSquareRootFloor(int num){

        if(num==0 || num==1){
            return num;
        }

        for(int i=1;i<=num/2+1;i++){
            if(i*i==num){
                return i;
            }else if(i*i>num){
                return i-1;
            }
        }
        return -1;

    }

    public static int findSquareRootFloorRec(int n){
        int low=0;
        int high = n/2+1;
        int ans = 0;

        while (low<=high){
            int mid = (low+high)/2;

            if(mid*mid==n){
                return mid;
            }else if(mid*mid>n){
                high = mid-1;
            }else {
                low = mid +1;
                ans = mid;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 4 ;

        System.out.println(findSquareRootFloor(50));
        System.out.println(findSquareRootFloorRec(50));

    }
}
