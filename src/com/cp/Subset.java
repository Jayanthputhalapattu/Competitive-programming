package com.cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subset {
    public static boolean perfectSquare(int n)
    {
        int start = 1;
        int end = n;
        while(start<=end)
        {
            int mid = (end) + (start -end)/2;

            if(mid*mid>n)
            {
                end = mid -1;

            }
            else if(mid*mid<n)
            {
                start = mid + 1;
            }
            else
                return true;
        }
        return false;
    }
    public static int squareFreeSubsets(int[] nums) {
        List<Integer> num = new ArrayList<>();
        long count = 0;
        for(int i:nums)
        {
            num.add(i);
        }
        List<List<Integer>> subset = subsets(new ArrayList<>(),num,new ArrayList<>(),0);
        for(int i=1;i<subset.size();i++)
        {
            List<Integer> inner = subset.get(i);
            int product = 1;
            for(int j=0;j<inner.size();j++)
            {
                product = product*inner.get(j);
            }

            int flag  = 0;
            for(int k=2;k<=product;k++)
            {
                if(product%(k*k)==0)
                {
                    flag=1;
                    break;
                }

            }
            if(flag==0)
            {
                System.out.println(product);
                count++;
            }

        }

        return (int)count;

    }
    public static List<List<Integer>> subsets(List<List<Integer>> subset,List<Integer> nums,List<Integer> output,int index)
    {
            if(index==nums.size())
            {
                subset.add(output);
                return subset;
            }
            subsets(subset,nums,new ArrayList<>(output),index + 1);

            output.add(nums.get(index));
            subsets(subset,nums,new ArrayList<>(output),index + 1);

            return  subset;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11,2,19,7,9,27);
        System.out.println(subsets(new ArrayList<>(),nums,new ArrayList<>(),0));
        int arr[] = {11,2,19,7,9,27};
        System.out.println(squareFreeSubsets(arr));
        System.out.println(perfectSquare(26));
    }
}
