package com.cp.leetCodeArchiveProblems;

import java.util.ArrayList;
import java.util.List;

public class SeperateDigits {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            String n = Integer.toString(nums[i]);
            for(int j=0;j<n.length();j++)
            {
                ans.add(Integer.parseInt(n.substring(j,j+1)));
            }
        }
        int finans[] = new int[ans.size()];
        for(int i=0;i<finans.length;i++)
        {
            finans[i] = ans.get(i);
        }
        return finans;
    }
    public static void main(String[] args) {

    }
}
