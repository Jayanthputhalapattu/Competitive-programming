package com.cp.prevPP;

import java.util.Arrays;

public class findPair {
    public static int findPair(int sorted[],int key,int original[])
    {
        int pair = 0;
        int length  = sorted.length;
        for(int i=0;i<sorted.length;i++)
        {
            if(key==sorted[i])
            {
                //found the element in the array
                    pair =sorted[ length - i -1];
                    break;

            }
        }

        int ans = 0;
        for(int i=0;i<original.length;i++)
        {
            if(original[i]==pair)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static int[] swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
        return arr;
    }
    public static int findMaxProduct(int nums[])
    {
        int swaps = 0;
        int original[] = Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i=i+2)
        {
            //find pair for the element
            int element = original[i];
            int pair = findPair(nums,element,original);

            System.out.println("arr :" + Arrays.toString(original));
            if(original[i+1] != original[pair])
            {
                swap(original,pair,i + 1);
                swaps++;
            }



        }
        return swaps;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,2,9,3,6};
        System.out.println(findMaxProduct(arr));
    }
}
