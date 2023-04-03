package com.cp.leetCodeArchiveProblems;

import java.util.Arrays;

public class MaxDiff2566 {
    public static int minMaxDifference(int num) {
        char max[] = (num+"").toCharArray();
        char min[] = (num +"").toCharArray();
        char maxChar = '9';
        char minChar = min[0];
        for(int i=0;i<max.length;i++)
        {
            if(max[i]!='9')
            {
                maxChar = max[i];
                break;
            }


        }
        for(int i=0;i<max.length;i++)
        {
            if(max[i]==maxChar)
            {
                max[i] = '9';
            }
            if(min[i]==minChar)
            {
                min[i] = '0';
            }
        }
        int maxInt = Integer.parseInt(new String(max));
        int minInt = Integer.parseInt(new String(min));
        return maxInt - minInt;


    }
    public static long findTheArrayConcVal(int[] nums) {
            long sum = 0;
            int ptr1 = 0;
            int ptr2 = nums.length-1;
            if(ptr1==ptr2)
            {
                return  0;
            }
            while(ptr1!=ptr2)
            {
                StringBuilder init = new StringBuilder(nums[ptr1]);
                StringBuilder fin = new StringBuilder(nums[ptr2]);
                StringBuilder sb = init.append(fin.toString());
                sum = sum + Integer.parseInt(sb.toString());
                ptr1++;
                ptr2--;
            }
            return sum;
    }
    public static long countFairPairs(int[] nums, int lower, int upper) {
        return helper(nums,lower,upper,1,0,0);
    }
    public static long helper(int[] nums,int l,int u,int r,int c,long count)
    {
        if(r== nums.length)
        {
            return count;
        }
        if(c<r)
        {
            int sum = nums[r] + nums[c];
            if(sum<=u && sum>=l)
                count++;
            count=helper(nums,l,u,r ,c+1,count);
        }
        else {
            count = helper(nums,l,u,r + 1,0,count);
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 203;
        System.out.println(minMaxDifference(11891));
        int nums[] = {0,1,7,4,4,5};
//        System.out.println(findTheArrayConcVal(nums));

        System.out.println(countFairPairs(nums,3,6));
    }
}
