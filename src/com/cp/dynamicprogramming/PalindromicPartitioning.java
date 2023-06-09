package com.cp.dynamicprogramming;

public class PalindromicPartitioning
{
    public static boolean isPalindrome(String s,int i,int j)
    {
        String newStr = s.substring(i,j+1);
        for(int p=0;p<newStr.length()/2;p++)
        {
            if(newStr.charAt(p)!=newStr.charAt(newStr.length()-1-p))
            {
                return false;
            }
        }
        return true;
    }
    public static int palindromicPartioning(String s,int i,int j)
    {
        if(i>=j)
        {
            return 0;

        }
        if(isPalindrome(s,i,j))
        {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int k = i;k<=j-1;k++)
        {
            int temp =  palindromicPartioning(s,i,k) + palindromicPartioning(s,k+1,j) + 1;
            if(temp<min)
            {
                min = temp;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        String s = "jayanth";
        System.out.println(palindromicPartioning(s,0,s.length()-1));
    }
}
