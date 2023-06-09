package com.cp.interviewPrepPS;

public class Debuss {
    public static String findReplaced(String s,String s1,String s2)
    {
        String newstr = "";
        int index = 0;
        while(s.substring(index).indexOf(s1)!=-1 && index<s.length() )
        {
            int ch = s.substring(index).indexOf(s1) + index;
            newstr = newstr + s.substring(index,ch) + s2;
            index = ch+s1.length();
        }
        return newstr+s.substring(index);
    }


    public static int check(String word1,String word2,String s[])
    {
        int index1 = 0;int index2 = 0;
        for(int i=0;i<s.length;i++)
        {
            if(word1.contentEquals(s[i]))
            {
                index1 = i;
            }
        }
        for(int i=0;i<s.length;i++)
        {
            if(word2.contentEquals(s[i]))
            {
                index2 = i;
                break;
            }
        }
        return Math.abs(index2-index1);
    }
    public static int minDistance(String s[],String word1,String word2)
    {
        return Math.min(check(word1,word2,s),check(word2,word1,s));
    }

    public static void main(String[] args) {
        String s[] = { "the", "quick", "brown", "fox", "quick"};
        System.out.println(minDistance(s,"quick","fox"));
        String S = "abababa";
        String s1 = "aba";
        String s2 = "a";
        System.out.println(findReplaced(S,s1,s2));
    }
}
