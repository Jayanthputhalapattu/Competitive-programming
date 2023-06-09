package com.cp.dynamicprogramming;

public class MatrixChainMultiplication {
    public static int[][] dp;
    public static int solveBottomUp(int arr[],int i,int j)
    {
        dp = new int[arr.length][arr.length];
        for(int p=0;p<arr.length;p++)
        {
            for(int q=0;q<arr.length;q++)
            {
                dp[p][q] = -1;
            }
        }
        if(i>=j)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;
        for(int k = i;k<=j-1;k++)
        {

            int tempans = solve(arr,i,k) + solve(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
            if(tempans<min)
            {
                min = tempans;
            }
//            System.out.println(tempans);

        }
        return dp[i][j] = min;
    }


    public static int solve(int arr[],int i, int j)
    {
        if(i>=j)
        {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int k = i;k<=j-1;k++)
        {

            int tempans = solve(arr,i,k) + solve(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
            if(tempans<min)
            {
                min = tempans;
            }
//            System.out.println(tempans);

        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,15};
//        System.out.println(solve(arr,1,arr.length-1));

        System.out.println(solveBottomUp(arr,1,arr.length-1));
    }
}
