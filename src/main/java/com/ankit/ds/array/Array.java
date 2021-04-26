package com.ankit.ds.array;

public class Array {

    public static int[] insert(int[] inputArray,int number,int position){
        if(position>inputArray.length){
            return inputArray;
        }else {
            int k = inputArray[position-1];
            inputArray[position-1] = number;
            for (int i=position;i<inputArray.length;i++){
               int j = inputArray[i];
               inputArray[i]=k;
               k=j;
            }
            return inputArray;
        }
    }

    public static int[] delete(int[] inputArray,int position){

        if(position>inputArray.length){
            return inputArray;
        }else {
            for (int i=position-1;i<inputArray.length-1;i++){
                inputArray[i] = inputArray[i+1];
            }
            inputArray[inputArray.length-1] = 0;
            return inputArray;
        }



    }

    public static int search(int[] inputArray, int number){
        int i = 0 ;
        for (int n:inputArray) {
            if(inputArray[i] == number){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int max(int[] inputArray){
        int max = 0;
        for (int i:inputArray) {
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public static int secondLargest(int[] inputArray){
        int largest = max(inputArray);
        int res = 0;
        for (int i:inputArray) {
            if(i==largest){
                continue;
            }
            if(i>res){
                res=i;
            }
        }
        return res;
    }

    public static int secondLargestEfficient(int[] inputArray){
        int max = 0;
        int secondLargest = 0;

        for (int i:inputArray) {
            if(i>max){
                secondLargest=max;
                max=i;
            }

        }
        return secondLargest;
    }

    public static boolean checkArraySorted(int[] inputArray){

        if(inputArray.length<2){
            return false;
        }

        if(inputArray[0]>inputArray[1]){
            for(int i=0;i<inputArray.length-1;i++){
                if(inputArray[i]<inputArray[i+1]){
                    return false;
                }
            }
            return true;
        }else {
            for (int i=0;i<inputArray.length-1;i++){
                if(inputArray[i]>inputArray[i+1]){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arrayofInt = new int[6];
        arrayofInt[0]=1;
        arrayofInt[1]=3;
        arrayofInt[2]=5;
        arrayofInt[3]=5;
        arrayofInt[4]=6;
        arrayofInt[5]=7;
        arrayofInt[2]=6;

//        int[] result = insert(arrayofInt,2,2);
//
//        for (int i :result) {
//            System.out.println(i);
//        }
//
//
//        System.out.println("New Array");
//        int[] res = delete(result,6);
//
//        for (int i:res){
//            System.out.println(i);
//        }

        System.out.println("Max-->" +max(arrayofInt));

        System.out.println("Second Largest-->" +secondLargest(arrayofInt));

        System.out.println("Second Largest--->" +secondLargestEfficient(arrayofInt));

        //int[] input = new int[]{1,3,4,5,6,8,11,17};
        //int[] input = new int[]{19,11,10,8,6};
        int[] input = new int[]{12,6,17,18,19};

        System.out.println(checkArraySorted(input));





    }
}
