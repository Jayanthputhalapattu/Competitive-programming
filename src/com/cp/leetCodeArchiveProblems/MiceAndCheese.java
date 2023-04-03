package com.cp.leetCodeArchiveProblems;

import java.util.Arrays;

public class MiceAndCheese {
    public static int maxIndex(int nums[],int k)
    {
        boolean istaken[] = new boolean[nums.length];
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int j=1;j<=k;j++)
        {
            max = Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>max && !istaken[i])
                {
                    max = nums[i];
                    maxIndex = i;

                }

            }
            istaken[maxIndex] = true;

        }

    return maxIndex;
    }
    public static int[] swap(int nums[],int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
    public static int miceAndCheese(int[] reward1, int[] reward2, int k) {
        boolean isTaken[] = new boolean[reward1.length];
        int rewards1[] = Arrays.copyOfRange(reward1,0,reward1.length);
        int score = 0;
        int p = k;
         for(int i=1;i<=k && p>0;i++)
        {
            int maxindex1 = maxIndex(reward1,i);
//            int maxindex2 = maxIndex(reward2,i);

            if(reward1[maxindex1]>reward2[maxindex1])
            {
                score+= reward1[maxindex1];
                isTaken[maxindex1] = true;
                p--;
            }
            else
                score+= reward2[maxindex1];
            isTaken[maxindex1] = true;

        }

         for(int i=0;i<reward2.length;i++)
         {
             if(!isTaken[i])
             {
                 score+=reward2[i];
             }
         }

         return score;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,3,4};
        int nums2[] = {4,4,1,1};

        System.out.println(miceAndCheese(nums,nums2,2));
    }
}
