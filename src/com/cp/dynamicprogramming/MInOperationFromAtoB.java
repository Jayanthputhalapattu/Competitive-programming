package com.cp.dynamicprogramming;

import java.util.Arrays;

public class MInOperationFromAtoB {
    public static int lcs(String x, String y)
    {
        int m = x.length();int n = y.length();
        int dp[][] = new int[m + 1][n + 1];

        for(int i=0;i< m + 1;i++)
        {
            for(int j = 0;j < n + 1 ;j++)
            {
                if(i==0 || j ==0)
                {
                    dp[i][j] = 0;
                }
                else if(x.charAt(i-1)==y.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static int makeAtoB(String x,String y)
    {
        int lcsAns = lcs(x,y);
        return x.length() + y.length() - 2*lcsAns;
    }
    public static int lps(String x)
    {
        return lcs(x,new StringBuilder(x).reverse().toString());
    }
    public static int minNoOfDeletionsToMakeStringAsPalindrome(String x)
    {
        return x.length() - lps(x);
    }
    public static String printSCS(String x,String y)
    {
        int m = x.length();
        int n = y.length();

        int dp[][] = new int[m + 1][n + 1];
        String ans = "";
        for(int i=0;i<m+1;i++)
        {
            for (int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j] = 0;
                }
                else if (x.charAt(i-1)==y.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                   dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        for(int p[]:dp)
        {
            System.out.println(Arrays.toString(p));
        }

        int i = m;
        int j = n;
        while(i>0 && j>0)
        {

            if(x.charAt(i-1)==y.charAt(j-1))
            {
                ans+=x.charAt(i-1);
                i--;
                j--;
            }
            else
            {
                if(dp[i][j-1]>dp[i-1][j])
                {
                    ans+=y.charAt(j-1);
                    j--;
                }
                else{
                    ans+=x.charAt(i-1);
                    i--;


                }
            }
        }

        while(i>0)
        {
            ans+=x.charAt(i-1);
            i--;
        }
        while(j>0)
        {
            ans+=y.charAt(j-1);
            j--;
        }
        return new StringBuilder(ans).reverse().toString();
    }
    public static String printLPS(String x)
    {
        String y = new StringBuilder(x).reverse().toString();
        int m = x.length();int n = y.length();
        int dp[][] = new int[m + 1][n + 1];

        for(int i=0;i< m + 1;i++)
        {
            for(int j = 0;j < n + 1 ;j++)
            {
                if(i==0 || j ==0)
                {
                    dp[i][j] = 0;
                }
                else if(x.charAt(i-1)==y.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        String ans="";
        int i = m;
        int j = m;
        while(i>0 && j>0)
        {
            if(x.charAt(i-1)==y.charAt(j-1))
            {
                ans+= x.charAt(i-1);
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
        return ans;

    }
    public static String longestRepeatingSubSeq(String x,String y)
    {
        int m = x.length();
        int n = y.length();

        int dp[][] = new int[m + 1][n + 1];
        String ans = "";
        for(int i=0;i<m+1;i++)
        {
            for (int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j] = 0;
                }
                else if (x.charAt(i-1)==y.charAt(j-1) && i!=j)
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        for(int p[]:dp)
        {
            System.out.println(Arrays.toString(p));
        }

        int i = m;
        int j = n;
        while(i>0 && j>0)
        {

            if(x.charAt(i-1)==y.charAt(j-1) && i!=j)
            {
                ans+=x.charAt(i-1);
                i--;
                j--;
            }
            else
            {
                if(dp[i][j-1]>dp[i-1][j])
                {

                    j--;
                }
                else{

                    i--;


                }
            }
        }


        return new StringBuilder(ans).reverse().toString();
    }

    public static void main(String[] args) {
//         String a = "jjqayanthy";
//         String b = "apan";
//        System.out.println(makeAtoB(a,b));
//        String z = "malayralqapm";
//        System.out.println(lps(z));
//        System.out.println("Min no of deletions : " + minNoOfDeletionsToMakeStringAsPalindrome(z));
//
//        System.out.println(printSCS(a,b));
//        System.out.println(longestRepeatingSubSeq(a,a));
        String name = "jayqanth";
        System.out.println(printLPS(name));
    }
}
