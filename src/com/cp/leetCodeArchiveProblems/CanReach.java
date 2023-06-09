package com.cp.leetCodeArchiveProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CanReach {
    public static boolean canReach(String s, int minJump, int maxJump) {
        boolean dp[] = new boolean[s.length() + 1];
        int n = s.length();
        if(s.charAt(n-1)=='0')
        {
//            dp[n] = true;
            dp[n-1] = true;
        }
        for (int i=n-1;i>=0;i--)
        {
            for(int j=minJump;j<=maxJump && i+j<dp.length;j++)
            {
                if(i==n-1 && s.charAt(i)=='0')
                {
                    dp[i] = true;
                }
                else if(dp[i+j] && s.charAt(i)=='0')
                {
                    dp[i] = true;
                    j = maxJump + 1;
                }
                else{
                    dp[i] = false;
                }
            }
            System.out.println(Arrays.toString(dp));
        }
        return dp[0];
    }
    public static List<String> printVertically(String s) {
        String strings[] = s.split(" ");
        System.out.println(Arrays.toString(strings));
        return new ArrayList<>();

    }
    public static void main(String[] args) {
            String s = "00111010";
        System.out.println(canReach(s,3,5));
        String s1 = "TO BE OR NOT TO BE";
        System.out.println(printVertically(s1));
    }
}
