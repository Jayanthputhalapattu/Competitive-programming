package com.cp.dynamicprogramming;

import java.util.Arrays;

public class LeastCommonSubString {
    public static int lcString(String x,String y)
    {
        int maxAns = Integer.MIN_VALUE;
        int m = x.length();
        int n = y.length();
        int dp[][] = new int[m + 1][n + 1];
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0 ||j==0)
                {
                    dp[i][j] = 0;
                }
                else if (x.charAt(i-1)==y.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if(maxAns<dp[i][j])
                    {
                        maxAns = dp[i][j];
                    }
                }
                else
                    dp[i][j] = 0;
            }
        }
        for(int[] p:dp)
        {
            System.out.println(Arrays.toString(p));
        }
        return maxAns;
    }
    public static void main(String[] args) {
        String x = "jayanth";
        String y = "anthjayan";
        System.out.println(lcString(x,y));
    }
}
