package com.cp.interviewPrepPS;

import java.util.Arrays;

public class MinJumps {
    public static int minMoves(int arr[])
    {
        Integer dp[] = new Integer[arr.length + 1];
        int n = arr.length;
        dp[n-1] = 0;
        for(int i=n-1;i>=0;i--)
        {
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=arr[i] && i+j<dp.length;j++)
            {
                if(dp[i+j]!=null)
                     min = Math.min(min,dp[i+j]);
             }
            if(min!=Integer.MAX_VALUE)
            {
                dp[i] = min+1;
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }
    public static void main(String[] args) {
                int arr[] = {2,3,1,1,4};
        System.out.println(minMoves(arr));
    }
}
