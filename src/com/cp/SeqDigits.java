package com.cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeqDigits {
    public static List<Integer> sequentialDigits(int low, int high) {
        String num1 = low+"";
        String num2 = high +"";
        String ans = "123456789";
        List<Integer> finAns = new ArrayList<>();
        int min = Math.min(num1.length(),num2.length());
        int max = Math.max(num1.length(),num2.length());
        for(int i=min;i<=max;i++)
        {
            for(int j=0;j<=ans.length()-i;j++)
            {
                //for min
                int substr = Integer.parseInt(ans.substring(j,i+j));
                if(substr>=low && substr <=high)
                {
                    finAns.add(substr);
                }
            }
        }
        return finAns;

    }
    public static int maxCoins(int[] nums) {

        int copy[] = Arrays.copyOfRange(nums,0,nums.length);

        return helper(nums,0,0,nums.length,copy);


    }
    public static int[] removeAtIndex(int nums[],int index)
    {
        for(int i=index + 1; i<nums.length;i++)
        {
            nums[i-1]  = nums[i];
        }
        nums[nums.length-1] = -1;
        return nums;
    }

    public static int helper(int[] nums,int sum,int ptr,int size,int[] copy)
    {
        System.out.println(Arrays.toString(nums));
            if(size==0)
            {
                return sum;
            }
            if(nums[0]==-1)
            {
                return sum;
            }
            int product = 0;
            if(ptr==0 && ptr <nums.length-1 && nums[ptr + 1] ==-1 && ptr==0)
            {
                    product = nums[ptr];
            }
            else if(ptr==0 && ptr + 1<=nums.length-1 && nums[ptr + 1]!=-1)
            {
                product = nums[ptr] * nums[ptr + 1];
            }
            else if(ptr!=0 &&ptr + 1<=nums.length-1 && nums[ptr  + 1]==-1)
            {
                product = nums[ptr -1] *nums[ptr] * nums[ptr + 1];
            }
            else if(ptr ==nums.length-1)
            {
                product = nums[ptr]*nums[ptr-1];
            }
            if(ptr>nums.length-1)
            {
                ptr = 0;
            }


            int right = helper(removeAtIndex(nums,ptr), sum + product,ptr,size -1,copy);

            int left = helper(nums,sum,ptr + 1,size,copy);

            sum = Math.max(left,right);

            return sum;
    }


    public static void main(String[] args) {
//            int low = 1000;
//            int high = 13000;
//        System.out.println(sequentialDigits(low,high));
//
//        int nums[] = {1,3,4,5};
//        removeAtIndex(nums,2);
//        System.out.println(Arrays.toString(nums));
        int nums [] = {3,1,5,8};
        System.out.println(maxCoins(nums));
        System.out.println();
    }
}
