package com.cp;

public class LargestContiguosSubArray {
    public static int LargestSubArray(int nums[],int r,int c,int sum)
    {
        System.out.println("Start : " + c + " End : " + r + " Sum :  " + sum);
        if(r==nums.length)
        {
            return sum;
        }
        if(c>=nums.length)
        {
            return 0;
        }

        if(c>r)
        {
            sum=0;
            sum = Math.max(sum,LargestSubArray(nums,r + 1,0,sum + nums[c]));
        }
        else {
            sum= Math.max(sum,LargestSubArray(nums,r,c + 1,sum + nums[c]));


        }


        return sum;
    }


    public static void main(String[] args) {
      int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(LargestSubArray(nums,0,0,0));
    }
}
