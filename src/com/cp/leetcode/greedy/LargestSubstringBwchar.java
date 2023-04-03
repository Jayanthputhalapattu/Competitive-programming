package com.cp.leetcode.greedy;

public class LargestSubstringBwchar {
    public static
    int maxLengthBetweenEqualCharacters(String s) {
        int min = 0;
        int max = 0;int ans = 0;
        for(int i=0;i<s.length();i++)
        {
            min = i;max = i;
            int index = s.indexOf(s.charAt(i)+"");
            while(index>=0)
            {
                index = s.indexOf(s.charAt(i)+"",index + 1);
                if(index!=-1) max = index;
            }
            ans = Math.max(ans,max-min -1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
