package com.cp.leetcode.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCOdeCOntest {
    public static int findSum(List<Integer> sub,int maxSum)
    {
        int sum = 0;
        for(int i=0;i<sub.size();i++)
        {
            if(!(sum>0 && sub.get(i)>0 && sum+sub.get(i)<0) && !(sum<0 && sub.get(i)<0 && sum+sub.get(i)>0))
            {
                sum+= sub.get(i);
            }
            else{
                return maxSum;
            }

                //dont add

        }
        return sum;
    }

    public static int maxScore(int[] nums) {
        List<Integer> num = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            num.add(nums[i]);
        }
        List<List<Integer>> subsets = findSubsets(new ArrayList<>(),new ArrayList<>(),num,0);
        int maxSum = 0;
        for(int i=0;i<subsets.size();i++)
        {
            //find sum
            List<Integer> subsub = subsets.get(i);
            int sum = findSum(subsub,maxSum);
            if(sum>maxSum)
            {
                maxSum = sum;
            }

        }
        return maxSum;
    }
    public static List<List<Integer>> findSubsets(List<List<Integer>> subset,List<Integer> ans, List<Integer> nums,int index)
    {
        if(index==nums.size())
        {
            subset.add(ans);
            //find sum
            return subset;
        }

        findSubsets(subset,new ArrayList<>(ans), nums,index + 1);

        ans.add(nums.get(index));
        findSubsets(subset,new ArrayList<>(ans),nums,index + 1);

        return subset;
    }
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
            for(int i=left;i<=right;i++)
            {
                char firstChar = words[i].charAt(0);
                char lastChar = words[i].charAt(words.length-1);
                if(firstChar=='a' || firstChar=='e' || firstChar=='i'||firstChar=='o'||firstChar=='u')
                {
                    if(lastChar=='a' || lastChar=='e' || lastChar=='i'||lastChar=='o'||lastChar=='u')
                    {
                        count++;
                    }
                }
            }
            return count;
    }


    public static void main(String[] args) {
            List<Integer > ans = Arrays.asList(2,-1,0,1,-3,3,-3);
    int nums[] = {-687767,-860350,950296,52109,510127,545329,-291223,-966728,852403,828596,456730,-483632,-529386,356766,147293,572374,243605,931468,641668,494446};
            List<List<Integer>> subsets = findSubsets(new ArrayList<>(),new ArrayList<>(),ans,0);
//        System.out.println(subsets);
//
        int maxScore = maxScore(nums);
        System.out.println("maxScore :" + maxScore);
    }
}
