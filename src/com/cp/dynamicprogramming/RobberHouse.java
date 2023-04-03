package com.cp.dynamicprogramming;

public class RobberHouse {
    public static int robberhouse(int nums[],int dp[],int i)
    {
        if(i>=nums.length)
        {
            return 0;
        }
        return dp[i] = Math.max(nums[i] + robberhouse(nums,dp,i+2),robberhouse(nums,dp,i+1));

    }

    public static void main(String[] args) {
        int nums[] = {2,7,9,3,1};
        int dp[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            dp[i] = -1;
        }
        int ans = robberhouse(nums,dp,0);
        System.out.println(ans);
    }
}
