package com.cp.leetCodeArchiveProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PickGifts2558 {
    public static boolean isStartEndSame(String str)
    {
        if(str.charAt(0)== str.charAt(str.length()-1))
        {
            return true;
        }
        return false;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        boolean ans[]  = new boolean[words.length];

        for(int i=0;i<words.length;i++)
        {
            if(isStartEndSame(words[i]))
            {
                ans[i] = true;
            }

        }
        int prefix[] = new int[ans.length];
        int currentSum = 0;
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i])
            {
                currentSum = currentSum + 1;
                prefix[i] =  currentSum;

            }
            else{
                prefix[i] = 0;
            }
        }
        int count[] = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int left = queries[i][0];
            int right = queries[i][1];
            if(left ==0)
                count[i] = prefix[right];
            else if (left==right)
            {
                count[i] = prefix[right] - prefix[left-1];
            }
            else
                count[i] = Math.abs(prefix[right]-prefix[left]);

        }
        return count;
    }
//    public long pickGifts(int[] gifts, int k) {
//            for(int i=1;i<=k;i++)
//            {
//                int maxInd = maxIndex(gifts);
//                gifts[maxInd] =(int) Math.floor(Math.sqrt(gifts[maxInd]));
//            }
//            int sum =0;
//            for(int i=0;i<gifts.length;i++)
//            {
//                sum+=gifts[i];
//            }
//            return sum;
//    }
    public static int findMax(int nums[],int currentIndex)
    {
        int minans[] = new int[nums.length];
        int fixedmax = nums[currentIndex];
        int max = nums[currentIndex];
        int min = Integer.MAX_VALUE;
        for(int i=currentIndex + 2;i<nums.length;i++)
        {
            max = Math.max(nums[i],fixedmax);
            min = Math.min(min,max);
        }
        return min;
    }


public static int minCapability(int[] nums, int k) {
    int max = nums[0];
    int min = nums[0];
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]>max)
            max = nums[i];
        if(nums[i]<min)
            min = nums[i];
    }
    int start= 1;
    int end = (int)1e9;
    while(start<end)
    {
        int take = 0;
        int mid = (start + end)/2;
        for(int i=0;i<nums.length;++i)
        {
            if(nums[i]<=mid)
            {
                take+=1;
                i++;
            }
        }
        if(take>=k)
        {
            end = mid;
        }
        else{
            start = mid + 1;
        }
    }
    return end;
}
    public static void main(String[] args) {
        int nums[] = {2,7,9,3,1};
        int k = 2;
        System.out.println(minCapability(nums,k));
    }
}
