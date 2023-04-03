package com.cp.leetcode.greedy;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
            return helper(height,0,0,0);
    }
    public static int helper(int height[],int count,int index,int i)
    {
            if(count==2||index==height.length-1)
            {
                System.out.println(index-1 + " " + i);
//                System.out.println((index-i)*Math.min(height[i],height[index]));
                return (index-i)*Math.min(height[i],height[index-1]);
            }

            int left = helper(height,count+1,index + 1,index);
            int right = helper(height,count,index + 1  ,i);

            return Math.max(left,right);

    }

    public static void main(String args[])
    {
        int height[] = {1,8,100,2,100,4,8,3,7};
        System.out.println(maxArea(height));
        System.out.println(Math.min(100,100));
    }
}
