package com.cp.interviewPrepPS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int s = 0;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target >nums[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }

        }
        System.out.println(start);
        s = start;

        start = 0;
        end = nums.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target <nums[mid])
            {
               end = mid-1;
            }
            else if(target>nums[mid]) {
                start = mid + 1;
            }
            else{
                start = mid + 1;
            }

        }
       int e = end;
        return new int[]{s,e};
    }
    public static boolean targetSum(int arr[],int index,int sum)
    {
        if(sum==0)
        {
            return true;
        }
        if(index==arr.length)
        {
            return false;
        }
        return targetSum(arr,index+1,sum-arr[index]) || targetSum(arr,index + 1,sum);
    }
    public static List<List<Integer>> targetSum(int arr[],int sum,int index,List<List<Integer>> ans,List<Integer> inner)
    {
        if(sum==0)
        {
            ans.add(inner);
            return ans;
        }
        if(index==arr.length)
        {
            return ans;
        }
        targetSum(arr,sum,index + 1,ans,inner);
        inner.add(arr[index]);
        targetSum(arr,sum-arr[index],index + 1,ans,inner);

        return ans;
    }

    public static void main(String[] args) {
            int ans[] = {7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(ans,8)));
        System.out.println(targetSum(ans,0,29));
        System.out.println(targetSum(ans,12,0,new ArrayList<>(),new ArrayList<>()));
    }
}
