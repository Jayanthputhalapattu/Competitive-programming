package com.cp;

import java.util.Arrays;

public class SplitWithMinSum {
    public int splitNum(int num) {
        String digits = new String(num+"");
       int arr[] = new int[digits.length()];

       for(int i=0;i<arr.length;i++)
       {
           arr[i]=Integer.parseInt(digits.charAt(i)+"");
       }
        Arrays.sort(arr);
       String ans1 = "";
       String ans2 = "";
       for(int i=0;i<arr.length;i++)
       {
           if(i%2==0)
           {
               ans1+= arr[i];
           }
           else {
               ans2+=arr[i];
           }
       }
       int finAns = Integer.parseInt(ans1)+Integer.parseInt(ans2);
       return finAns;
    }
    public static int[] leftRigthDifference(int[] nums) {
    int ans[] = new int[nums.length];
     for(int i=0;i<nums.length;i++)
     {
         int leftsum = 0;
         int rightsum = 0;
         for(int j=i+1;j<nums.length;j++)
         {
             rightsum+=nums[j];
         }
         for(int j=i-1;j>=0;j--)
         {
             leftsum +=nums[j];
         }
ans[i] = Math.abs(leftsum-rightsum);
     }
        return ans;
    }
    public static long coloredCells(int n) {

        long ans = 1;
        long untouched = 4;
        for(int i=2;i<=n;i++)
        {
            ans+=  untouched;
            untouched = untouched + 4;

        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {10,4,8,3};
        int ans[] = leftRigthDifference(nums);
        System.out.println(Arrays.toString(ans));
    }
}
