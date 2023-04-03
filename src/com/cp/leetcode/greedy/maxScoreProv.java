package com.cp.leetcode.greedy;

import java.util.Arrays;

public class maxScoreProv {
    public static int findMinIndex(int nums[],int end)
    {
        int minElement = nums[0];int maxIndex = 0;
        for(int i=0;i<=end;i++)
        {
            if(nums[i]<minElement)
            {
                minElement = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int[] swap(int nums[],int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
    public static int maxScore(int[] nums)
    {
        long sum = 0;
        int i=nums.length-1;
        Arrays.sort(nums);
        if(nums[nums.length-1] == 0)    return 0;
        while(i >= 0){
            sum += nums[i--];
            if(sum <= 0) return nums.length-i-2;
        }
        return nums.length;
    }
    public static void main(String[] args) {
            int nums[] = {-687767,-860350,950296,52109,510127,545329,-291223,-966728,852403,828596,456730,-483632,-529386,356766,147293,572374,243605,931468,641668,494446};
//            maxScore(nums);
//        System.out.println(Arrays.toString(nums));
        int ans = maxScore(nums);
        System.out.println(ans);
    }
}
