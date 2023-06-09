package com.cp.dynamicprogramming;

import java.util.Arrays;

public class Fib {
    public static int fib(int n,int dp[])
    {
        if(n==1 || n==0)
        {

            return n;

        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int ans =  fib(n-1,dp) + fib(n-2,dp);
        dp[n] = ans;
        System.out.println(Arrays.toString(dp));
        return ans;
    }
    public static void main(String[] args) {
            int n = 7;
        System.out.println(fib(n,new int[n+1]));
    }
}
