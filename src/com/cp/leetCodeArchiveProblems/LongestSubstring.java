package com.cp.leetCodeArchiveProblems;

public class LongestSubstring {
    public static int findTheLongestBalancedSubstring(String s) {
        int zerosCount = 0;
        int oneCount = 0;
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                oneCount =0;
                zerosCount++;
            }
            else{
                oneCount++;
                int min = Math.min(oneCount,zerosCount);
                if(i!=s.length()-1)
                {
                    if(s.charAt(i+1)=='0')
                        zerosCount = 0;
                }
                max = Math.max(max,min*2);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "01011";
        System.out.println(findTheLongestBalancedSubstring(s));

    }
}
