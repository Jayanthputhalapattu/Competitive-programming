package com.cp.leetCodeArchiveProblems;

import java.util.Arrays;

public class Maximumcostsubstring {
    public static int maximumCostSubstring(String s, String chars, int[] vals) {
        int nums[] = new int[s.length()];

        for(int i=0;i<nums.length;i++)
        {
            if(chars.contains(s.charAt(i)+""))
            {
                nums[i] = vals[chars.indexOf(s.charAt(i))];
            }
            else{
                nums[i] = s.charAt(i)-'a' + 1;
            }

        }
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max_ending_here = max_ending_here+nums[i];

            if(max_ending_here>max_so_far)
            {
                max_so_far = max_ending_here;
            }
            if(max_ending_here<0)
            {
                max_ending_here = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        return max_so_far;
    }

    public static void main(String[] args) {
        String s = "adaa";
        String chars ="d";
        int arr[] = {-1000};
        System.out.println(maximumCostSubstring(s,chars,arr));
    }
}
