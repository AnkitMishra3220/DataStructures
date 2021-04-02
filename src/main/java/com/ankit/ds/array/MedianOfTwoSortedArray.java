package com.ankit.ds.array;

/*

  max1 > min2 --> Left other Right

 */
public class MedianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double result = 0.0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int begin1 = 0;
        int end1 = 0;

        if (length1 < 1 && length2 < 1) {
            return result;
        }
        end1 = length1;
        while (begin1 <= end1) {
            int i1 = (begin1 + end1) / 2;
            int i2 = (length1 + length2 + 1) / 2 - i1;
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : nums1[i1 - 1];
            int max2 = (i1 == 0) ? Integer.MIN_VALUE : nums2[i2 - 1];
            int min1 = (i1 == length1) ? Integer.MAX_VALUE : nums1[i1];
            int min2 = (i2 == length2) ? Integer.MAX_VALUE : nums2[i2];

            if (max1 <= min2 && max2 <= min1) {
                if ((length1 + length2) % 2 == 0) {
                    return (double) (Math.max(max1, max2) + Math.min(min1, min2)) / 2;
                } else {
                    return Math.max(max1, max2);
                }
            } else if (max1 > min2) {
                end1 = i1-1;
            } else {
                begin1 = i1+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{10,20,30};
        int[] arr2 = new int[]{5,15,25,35,45};
        // {5,10,15,20,25,30,35,45} -> 20+25/2 = 22.5
        System.out.println(findMedianSortedArrays(arr1,arr2));

    }
}
