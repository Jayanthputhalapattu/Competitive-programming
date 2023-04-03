package com.cp.dynamicprogramming;

import java.util.Arrays;

public class Fibnocci {
    public static int fibMem(int n,int[] dp)
    {
        if(n==0 || n == 1)
            return n;
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int ans =  fibMem(n-1,dp) + fibMem(n-2,dp);
        dp[n] = ans;
        return ans;
    }
    public static int countPaths(int n,int dp[])
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(dp[n]>0)
        {
            return dp[n];
        }
        int nm1  = countPaths(n-1,dp);
        int nm2 = countPaths(n-2,dp);
        int nm3 = countPaths(n-3,dp);
        int ans = nm1 + nm2 + nm3;
        dp[n] = ans;
        return nm1 + nm2 + nm3;
    }
    public static int climbWays(int arr[])
    {
        int n = arr.length;
        int dp[] = new int[n+1];
        dp[n]= 1;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=arr[i] && i+j<dp.length;j++)
            {
                dp[i] += dp[i+j];
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];

    }
    public static int minMovesToReachTop(int arr[])
    {
        int n = arr.length;
        Integer dp[] = new Integer[n+1];
        dp[n] = 0;
        for(int i=n-1;i>=0;i--)
        {
            int min = Integer.MAX_VALUE;
            if(arr[i]>0)
            {
                for(int j=1;j<=arr[i] && i + j<dp.length;j++)
                {
                    if(dp[i+j]!=null)
                        min = Math.min(min,dp[i+j]);
                }
            }
            if(min!=Integer.MAX_VALUE)
            {
                dp[i] = min + 1;
            }
        }
        System.out.println(Arrays.toString(dp));

        return dp[0];
    }
    public static int minCostMaze(int arr[][],int r,int c,int cost)
    {
        if(r==arr.length-1 && c==arr[0].length-1)
        {
            cost+=arr[r][c];
            return cost;
        }
        int bottom = 0;
        int right = 0;
        if(r< arr.length-1)
        {
            bottom = minCostMaze(arr,r+1,c,cost+arr[r][c]);
        }
        if(c<arr[0].length-1)
        {
            right = minCostMaze(arr,r,c+1,cost+arr[r][c]);
        }
        return Math.min(bottom,right);
//        if(r<arr.length-1 && c<arr[0].length-1)
//             return Math.min(minCostMaze(arr,r+1,c,cost+arr[r][c]),
//             minCostMaze(arr,r,c+1,cost+arr[r][c]));
//        else if(r==arr.length-1)
//        {
//            return minCostMaze(arr,r,c+1,cost + arr[r][c]);
//        }
//        return minCostMaze(arr,r+1,c,cost + arr[r][c]);

    }
    public static int minCostMaze(int grid[][] )
    {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][]  = new int[m][n];
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(i+1>m-1 && j+1>n-1)
                {
                    dp[i][j] = grid[i][j];
                }
                else if(i+1>m-1)
                {
                    dp[i][j] = dp[i][j+1] + grid[i][j];
                }
                else if(j+1>n-1)
                {
                    dp[i][j] = dp[i+1][j] + grid[i][j];
                }
                else
                    dp[i][j] = Math.min(dp[i+1][j] + grid[i][j],dp[i][j+1] +grid[i][j] );
            }

        }
        return dp[0][0];
    }

    public static void main(String[] args) {

        int nums[][] = {{1,2,3},
                         {4,5,6}
                        ,{7,8,9}
        };
        //            int n = 8;
////        System.out.println(fibMem(n,new int[n+1]));
////        System.out.println(countPaths(4,new int[4 +1]));
////        System.out.println(climbWays(new int[]{3,3,0,2,2,3}));
//         int arr[] = {3,2,4,2,0,2,3,1,2,2};
//         int num = minMovesToReachTop(arr);
//        System.out.println(num);

//        System.out.println(minCostMaze(nums,0,0,0));
        System.out.println(minCostMaze(nums));
    }


}
