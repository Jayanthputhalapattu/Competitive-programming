package com.cp.dynamicprogramming;

public class LongestPalindromicSubstr {
    public static String longestPalindrome(String s,int ptr1,int ptr2,int count) {

        if(ptr1>=ptr2)
        {
            return "";
        }
        if(s.charAt(ptr1)!=s.charAt(ptr2))
        {
           longestPalindrome(s,ptr1+1,ptr2,count);
           longestPalindrome(s,ptr1,ptr2-1,count);
        }
        else{
            longestPalindrome(s,ptr1+1,ptr2-1,count+2);
        }

        System.out.println(s.substring(ptr1,ptr2));
        return "";
    }
    public static String palidnrome(String s,int left,int right)
    {

        for(int i=0;i<s.length();i++)

        {
            if(left==0 && right==s.length()-1)
            {
                if(s.charAt(left)==s.charAt(right))
                {
                    return s;
                }
            }
            else if(left==0 && right<s.length()-1)
            {
                if(s.charAt(left)==s.charAt(right+1))
                    right++;
            }
            else if(right==s.length()-1 && left>0)
            {
                if(s.charAt(left-1)==s.charAt(right))
                {
                    left--;
                }
            }
            else{
                if(s.charAt(left-1)==s.charAt(right + 1))
                {
                    left--;
                    right++;
                }
            }

        }

        return s.substring(left,right+1);
    }
    public static String longestPalindrome(String s)
    {
        String ans = "";
        for(int i=0;i<s.length()-1;i++)
        {
            String odd = palidnrome(s,i,i);
            String even = palidnrome(s,i,i+1);
            System.out.println(odd + " " + even);
            if(odd.length()>even.length())
            {
                if(odd.length()>ans.length())
                    ans = new String(odd);
            }
            else{
                if(even.length()>ans.length())
                    ans = new String(even);
            }




        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaabaaaa"));
//        System.out.println(palidnrome("babad",2,2));
    }
}
