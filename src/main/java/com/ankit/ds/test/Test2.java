package com.ankit.ds.test;

public class Test2 {

    public static void main(String[] args) {
       int[] input = {1,3,5,7,3,4,3,3}; //--> 4
       int[] out = countFrequency(input);

// {1,3,5,7,3,4,3,3}

       // {1,3,3,3,3,4,7} // nlogn





//      for(int i=0;i<out.length;i++){
//          System.out.println(out[i]);
//      }

       int max = 0;
       for(int i=0;i<out.length;i++){
           if(out[i]>max){
               max = out[i];
           }
       }

       System.out.println(max);

    }
 //   {0,2,4,6,2,3,2,2};
  //  {}
    public static int[] countFrequency(int[] input){
        int length = input.length;

        for(int i=0;i<length;i++){
            input[i] = input[i]-1;
        }
        for(int i=0;i<length;i++){
            input[input[i]%length]= input[input[i]%length]+length;
        }


        for (int i=0;i<length;i++){
            input[i] = input[i]/length;
        }
        return input;
    }
}
