package com.cp.leetCodeArchiveProblems;

import java.util.ArrayList;
import java.util.List;

public class MaxSumdivThree {
    public static int maxSumDivThree(int[] nums) {
        List<Integer> num = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            num.add(nums[i]);
        }
        List<List<Integer>> subsets =  findSubsets(new ArrayList<>(),new ArrayList<>(),num,0);
        System.out.println(subsets);
        return 1;
    }
    public static List<List<Integer>> findSubsets(List<List<Integer>> ans, List<Integer> inner,List<Integer> nums,int index)
    {
            if(index == nums.size())
            {
                ans.add(inner);
                return ans;
            }


            findSubsets(ans,new ArrayList<>(),nums,index + 1);
            inner.add(nums.get(index));
            findSubsets(ans,inner,nums,index + 1);

            return ans;
    }

    public static void main(String[] args) {
                int nums[] = {1,2,3,4};
        System.out.println(maxSumDivThree(nums));
     }
}
