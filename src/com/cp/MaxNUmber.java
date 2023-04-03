package com.cp;

public class MaxNUmber {
    public static int[]  findMaxElementAndmovePtr(int[] nums1,int[] nums2,int ptr1,int ptr2)
    {

        int maxElement = 0;
        int tempPtr1 = ptr1;
        int tempPtr2 = ptr2;
        for(int i =ptr1 + 1;i<nums1.length;i++)
        {
            if(nums1[i]>maxElement)
            {
                maxElement = nums1[i];
                ptr1 = i;
            }
        }
        for(int i = ptr2 + 1;i<nums2.length;i++)
        {
            if(nums2[i]>maxElement)
            {
                maxElement = nums2[i];
                ptr2= i;

                ptr1 = tempPtr1;

            }
//            else{
//                ptr1 = tempPtr1;
//            }

        }
        int arr[] = {maxElement,ptr1,ptr2};
        return arr;
    }

    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
            int ptr1 = -1;
            int ptr2 = -1;
            int maxElement = Integer.MIN_VALUE;
            int index = 0;
            while(index<k)
            {
                int arr[] = findMaxElementAndmovePtr(nums1,nums2,ptr1,ptr2);
               maxElement= arr[0];
               ptr1 = arr[1];
               ptr2 = arr[2];
                System.out.println(ptr1 + " " + ptr2 + " " + maxElement);
                index++;
            }

            return new int[2];
    }
    public static void main(String[] args) {
            int nums1[] = {3,9};
            int nums2[] = {8,9};
            int k = 5;
        System.out.println(maxNumber(nums1,nums2,k));

    }
}
