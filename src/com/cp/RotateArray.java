package com.cp;

import java.util.Arrays;

public class RotateArray {
    public static int[] swap(int arr[],int left,int right)
    {
        while(left<right)
        {
            int temp = arr[left];
            arr[left]  = arr[right];
            arr[right]  = temp;

            left++;
            right--;
        }
        return arr;
    }
    public static void  rotate(int nums[],int k)
    {
        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr,3);
    }
}
