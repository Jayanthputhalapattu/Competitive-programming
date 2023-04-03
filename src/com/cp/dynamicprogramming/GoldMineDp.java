package com.cp.dynamicprogramming;

import java.util.Arrays;

public class GoldMineDp {
    public static int goldMineMax(int nums[][])
    {
        int m = nums.length;
        int n = nums[0].length;
        int dp[][] = new int[m][n];

        for(int j=m-1;j>=0;j--)
        {
            for(int i=n-1;i>=0;i--)
            {
                if(j==n-1)
                {
                    dp[i][j] = nums[i][j];

                }
                else if(i==0)
                {
                    dp[i][j] = Math.max(nums[i][j] + dp[i][j+1],nums[i][j] + dp[i+1][j+1]);

                }
                else if(i==nums.length-1)
                {
                    dp[i][j] = Math.max(nums[i][j] + dp[i][j+1],nums[i][j] + dp[i-1][j+1]);
                }

                else{
                    dp[i][j] = Math.max(nums[i][j] + dp[i][j + 1],Math.max(dp[i-1][j+1] +nums[i][j] ,nums[i][j] + dp[i+1][j+1]));
                }
            }
        }
        for(int[] d:dp)
        {
            System.out.println(Arrays.toString(d));
        }
        int ans = 0;
        for(int i=0;i< nums.length;i++)
        {
            ans = Math.max(ans,dp[i][0]);
        }
        return ans;
    }
//    public static int mineCost(int nums[][],int dp[][],int i,int j,int cost)
//    {
//        if(j==nums[0].length-1)
//        {
//            return nums[i][j];
//        }
//        int forward = 0;int diagUp = 0;int diagDown = 0;
//        if(i==0)
//            forward = Math.max(mineCost(nums,dp,i,j+1,cost+nums[i][j]) , mineCost(nums,i+1,j+1,cost+nums[i][j]);
//
//        if(i==nums.length-1)
//            forward = mineCost(nums,co)
//    }
    public static boolean canGo(int nums[])
    {
        boolean dp[] = new boolean[nums.length];
        int n = nums.length;
        int ptr = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(i+nums[i]>=ptr)
            {
                return true;
            }

            for(int j=0;j<=nums[i] &&i+j<dp.length;j++)
            {

                if(dp[i+j])
                {
                    dp[i] = true;
                    ptr = i;
                }
                if(i+j==nums.length-1)
                {
                 dp[i] = true;
                 ptr = i;
                }


            }

        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }
    public static int uniquePaths(int m,int n)
    {
        int[][] dp = new int[m][n];

        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
               if(i==m-1 && j==n-1)
               {
                   dp[i][j] = 1;
               }
               else if(i==m-1)
               {
                   dp[i][j] += dp[i][j+1];
               }
               else if(j==n-1)
               {
                   dp[i][j]+= dp[i+1][j];
               }
               else{
                   dp[i][j] = dp[i+1][j] + dp[i][j+1];
               }


            }
        }
        for(int l[]:dp)
        {
            System.out.println(Arrays.toString(l));
        }
        return dp[0][0];
    }
    public static int uniquePaths(int m, int n,int i,int j) {
        if(i==m && j==n)
        {
            return 1;
        }
        int right  = 0;
        int bottom = 0;
        if(i<m)
        {
            bottom = uniquePaths(m,n,i+1,j);
        }
        if(j<n)
        {
            right = uniquePaths(m,n,i,j+1);
        }
        return bottom + right;
    }
    public static boolean cango(int nums[])
    {
        int target = nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] + i>=target)
            {
                target = i;
            }
        }
        return target==0;
    }
    public static void main(String[] args) {
//       ` int[][] nums = {{0, 1, 4, 2, 8, 2},
//                {4, 3, 6, 5, 0, 4}, {1, 2, 4, 1, 4, 6}, {2, 0, 7, 3, 2, 2}, {3, 1, 5, 9, 2, 4}, {2, 7, 0, 8, 5, 1}};
//
//        System.out.println(goldMineMax(nums));
        int nums[] = {3,2,1,0,2};
        System.out.println(canGo(nums));
        int m = 3;
        int n = 7;
//        System.out.println(uniquePaths(m,n,1,1));
        System.out.println(uniquePaths(m,n));
    }
}
