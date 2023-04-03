package com.cp.leetCodeArchiveProblems;

import java.util.*;

public class ConvertArrayToConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])!=null)
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i] ,1);
            }

        }
        int maxRepetition = 0;
        for(Map.Entry<Integer,Integer> m : map.entrySet())
        {
            maxRepetition = Math.max(maxRepetition,map.get(m.getKey()));
        }
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<maxRepetition;i++)
        {
            ans.add(new ArrayList<>());
        }
        int intCount = 1;
        int presentInt = nums[0];
        ans.get(0).add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(presentInt==nums[i])
            {
                intCount++;
                ans.get(intCount).add(nums[i]);
            }
            else{
                presentInt = nums[i];
                intCount = 1;
                ans.get(intCount).add(nums[i]);
            }
        }

return ans;
    }

    public static void main(String[] args) {

    }
}
