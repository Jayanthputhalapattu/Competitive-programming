package com.cp.leetCodeArchiveProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountIncreasingQuadruplets {
    public long countQuadruplets(int[] nums) {
                for (int i=0;i<nums.length;i++)
                {
                    for(int j=i + 1;j<nums.length;j++)
                    {
                        int current = nums[i];
                        int jj = 0;
                        int k = 0;
                        int l = 0;

                    }
                }
                return 0;
    }
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        for(int i=0;i<s.length()/2;i++) {
            int num = Integer.parseInt(s.charAt(i)+"");
            if(i%2==0)
            {
                sum+= num;
            }
            else{
                sum-=num;
            }

        }
        return sum;
    }
    public int[][] swap(int[][] score,int p,int q)
    {
        for(int i=0;i<score[0].length;i++)
        {
              int temp = score[p][i];
              score[q][i] = score[p][i];
              score[p][i] = temp;
        }
        return score;
    }
    public static int minCost(int[] nums, int k) {
        List<Integer> present = new ArrayList<>();
        int cost = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(present.contains(nums[i]) && present.size()<=k)
            {

                    present = new ArrayList<>();
                    present.add(nums[i]);
                    cost+=k + present.size();

            }
            else {
                present.add(nums[i]);
                Map<Integer,Integer> map = new HashMap<>();
                int count = 0;
                if(i==nums.length-1)
                {
                    //you came to end of the array..
                    for(int p=0;p<present.size();p++)
                    {
                        if(map.containsKey(present.get(p)))
                        {
                            map.put(present.get(p),map.get(present.get(p)) + 1);
                        }
                        else{
                            map.put(present.get(p),1);
                        }
                    }
                    for(Map.Entry<Integer,Integer> m : map.entrySet())
                    {
                            if(!map.isEmpty() &&map.get(m.getKey())>1 )
                            {
                                count+=map.get(m.getKey());
                            }
                    }
                    cost+=count +k;
                }

            }
        }
        return cost;
    }
    public static int maxIndex(int[][] scores,int k,int end)
    {
        int max = 0;
        int maxindex = 0;
        for(int i=0;i<=end;i++)
        {
                if(scores[k][i]>max)
                {
                    max = scores[k][i];
                    maxindex = i;
                }
        }
        return maxindex;
    }
    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length;i++)
        {
            int end = i;
            int maxindex = maxIndex(score,k ,end);
            swap(score,maxindex,i);


        }
        return score;
    }
    public static void main(String[] args) {
            int nums[]  = {2,3,3,3,1,5,5,0,5,3,4,2,1,2,5,1,2,0};
            int k = 5;
        System.out.println(minCost(nums,k));
    }
}
