package com.cp;

import java.util.Arrays;

public class FindMaxIndices {
    public static int findMaxIndex(int num[],boolean isFilled[])
    {
        int maxElement = num[0];
        int maxIndex  = 0;
        for (int i=0;i<num.length;i++)
        {
            if(num[i]>maxElement && !isFilled[i])
            {
                maxElement = num[i];
                maxIndex = i;
            }

        }
        return maxIndex;
    }
    public static int[] divisibilityArray(String word, int m) {
        int ans[] = new int[word.length()];
        long rem = 0;
        for (int i = 0; i < word.length(); i++) {
            long presentDigit = word.charAt(i) - '0';
            rem = ((rem * 10) + presentDigit) % m;
            if (rem == 0) {
                ans[i] = 1;
            }


        }
        return ans;
    }
        public static int maxNumOfMarkedIndices ( int[] nums) {
            Arrays.sort(nums);

            int count = 0;
            int j = nums.length - 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] <= nums[j] / 2) {
                    count += 2;
                    j--;
                }
            }
            return count;
        }
        public static int findLastPower(String n)
        {
            int latest = 0;
            int latestz = 0;
            for(int i=0;i<n.length();i++)
            {
                if(n.charAt(i)=='1')
                {
                    latest  = i;
                }
            }
            for(int i=0;i<latest;i++)
            {
                if(n.charAt(i)=='0')
                {
                    latestz = i;
                }
            }
            int mult = 1;
            if(latest-latestz>1)
                mult = 1;
            else if(latest - latestz==1)
            {
                mult = -1;
            }

            return (int)Math.pow(2,n.length()-1-latest) *mult;
        }
    public static int minOperations(int n) {
            String binstr= Integer.toBinaryString(n);
            int count = 1;
            boolean isPowerofTrue = Math.ceil(Math.log(n)/Math.log(2)) == Math.floor(Math.log(n)/Math.log(2));
            while(!isPowerofTrue && n!=0)
            {
                int lastpower = findLastPower(binstr);
                n = n + lastpower;
                binstr = Integer.toBinaryString(n);
                n = Integer.parseInt(binstr,2);
                isPowerofTrue = Math.ceil(Math.log(n)/Math.log(2)) == Math.floor(Math.log(n)/Math.log(2));
                count++;
            }
            return count;
    }
    public static void main(String[] args) {
////        int nums[] = {9,2,5,4};
////        int ans = maxNumOfMarkedIndices(nums);
////        System.out.println(ans);
//
//        String str = "529282143571"
//                ;int m = 4;
//        System.out.println(Arrays.toString(divisibilityArray(str,m)));
        int num = 39;
        System.out.println(minOperations(num));
    }
}
