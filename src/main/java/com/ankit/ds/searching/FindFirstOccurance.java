package com.ankit.ds.searching;

public class FindFirstOccurance {

    public static int findFirstOccurance(int[] input, int k) {
        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (k > input[mid]) {
                low = mid + 1;
            } else if (k < input[mid]) {
                high = mid - 1;
            } else {
                if (mid == 0 || input[mid - 1] != input[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] arrayOfInt = new int[]{3, 6, 8, 9, 10, 10, 10, 22};
        int[] arrayOfInt1 = new int[]{3, 3, 3, 3, 6, 6, 6, 7, 7, 8, 9, 9, 10};

        System.out.println(findFirstOccurance(arrayOfInt, 10));
     //   System.out.println(findFirstOccurance(arrayOfInt1, 3));

    }


}
