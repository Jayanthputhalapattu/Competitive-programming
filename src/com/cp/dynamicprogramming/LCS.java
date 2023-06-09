package com.cp.dynamicprogramming;

import java.util.Arrays;

public class LCS {
    static int count = 0;

    public static int lcs(String x,String y,int m,int n)
    {
        if(m==0 || n==0)
        {
            count++;
            return 0;
        }
        if(x.charAt(m-1)==y.charAt(n-1))
        {
            return 1 + lcs(x,y,m-1,n-1);
        }
        else{
            return Math.max( lcs(x,y,m-1,n) ,lcs(x,y,m,n-1));
        }
    }
    public static int lcsTopDowm(String x,String y)
    {
        int m = x.length();
        int n = y.length();
        int dp[][] = new int[m + 1][n + 1];

        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j] = 0;
                }
                else if(x.charAt(i-1)==y.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        String ans = "";
        int i = m;
        int j = n;
      while(i>0 && j>0)
      {
          if(x.charAt(i-1)==y.charAt(j-1))
                {
                    ans = ans + x.charAt(i-1);
                    i--;
                    j--;

                }
                else{
                    if(dp[i][j-1]>dp[i-1][j])
                    {
                       j--;
                    }
                    else{
                      i--;
                    }
                }
            }
        System.out.println(new StringBuilder(ans).reverse());
        return dp[m][n];
    }


    public static int lcsmem(String x,String y,int m,int n,int dp[][])
    {
        if(m==0 || n==0)
        {
            count++;
            return 0;
        }
        if(dp[m][n]!=-1)
        {
            return dp[m][n];
        }
        if(x.charAt(m-1)==y.charAt(n-1))
        {
            return dp[m][n] = 1 + lcsmem(x,y,m-1,n-1,dp);
        }
        else{
            return dp[m][n] = Math.max( lcsmem(x,y,m-1,n,dp) ,lcsmem(x,y,m,n-1,dp));
        }
    }
    public static void main(String[] args) {
            String x = "JAYANTH";
            String y = "APNQTSH";
            int dp[][] = new int[x.length() + 1][y.length() + 1];
            for(int i=0;i<dp.length;i++)
            {
                for(int j=0;j<dp[0].length;j++)
                {
                    dp[i][j] = -1;
                }
            }
        System.out.println(lcsTopDowm(x,y));

    }
}

