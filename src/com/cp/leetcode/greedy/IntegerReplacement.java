package com.cp.leetcode.greedy;

import java.util.Arrays;

public class IntegerReplacement {
    public static int integerReplacement(int n) {
        int steps = 0;
            return helper( n,steps);
    }
    public static int helper(int n,int ans)
    {
        if(n==1)
        {
            return ans;
        }


        if(n%2==0)
        {
           ans =  helper(n/2,ans + 1 );
        }
        else{
            ans =  Math.min(helper(n-1,ans + 1),helper(n + 1,ans + 1));
        }

        return ans;
    }

    public static int beautySum(int nums[],int k)
    {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<k;i++)
        {
            sum += nums[nums.length-i-1]*nums[nums.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
//            int n = (int)(Math.pow(2,31))-2;
//        System.out.println(integerReplacement(n));

        int nums[] = {1,2,3,5,4};
        System.out.println(beautySum(nums,2));
    }
}
