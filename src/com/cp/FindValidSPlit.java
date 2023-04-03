package com.cp;

public class FindValidSPlit {
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
            return gcd(b,a%b);
    }
    public static int findValidSplit(int[] nums) {
        int prod = 1;
        int prefix = 1;
        int suffix = 1;
        for(int i=0;i<nums.length;i++)
        {
            prod  = prod*nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            prefix = prefix * nums[i];
            suffix= prod/prefix;
            if(gcd(prefix,suffix)==1 &&prefix!=1 && suffix!=1)
            {

                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,7,15,8,3,5};
        int index = findValidSplit(nums);
        System.out.println(index);
    }
}
