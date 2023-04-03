package com.cp.leetCodeArchiveProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormSmallestNumbers {
    public static int findSmallestIndex(int arr[])
    {
        int min = arr[0];
        int minIndex = 0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
                minIndex = i;
            }

        }
        return minIndex;
    }
    public static int minNumber(int[] nums1, int[] nums2) {
            int smallone = findSmallestIndex(nums1);
            int smalltwo = findSmallestIndex(nums2);
            int ans = 0;
            int min = Integer.MAX_VALUE;
            List<Integer> nums = new ArrayList<>();
            for(int i:nums2)
                nums.add(i);

            for(int i=0;i<nums1.length;i++)
            {
                if(nums.indexOf(nums1[i])!=-1)
                {
                    min = Math.min(min,nums1[i]);
                }
            }
            if(min!=Integer.MAX_VALUE)
                    return min;
            if(nums1[smallone]==nums2[smalltwo])
            {
                return nums1[smallone];
            }
            else if(nums1[smallone]<nums2[smalltwo]) {
                ans = Integer.parseInt(""+nums1[smallone] + nums2[smalltwo] );
            }
            else
            {
                ans = Integer.parseInt( ""+nums2[smalltwo] +nums1[smallone]);
            }

            return ans;
    }

    public static void main(String[] args) {
int nums1[] = {3,5,2,6};
int nums2[] = {3,1,7};
        System.out.println(minNumber(nums1,nums2));
    }
}
