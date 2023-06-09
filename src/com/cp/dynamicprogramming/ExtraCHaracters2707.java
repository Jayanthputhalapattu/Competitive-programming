package com.cp.dynamicprogramming;

public class ExtraCHaracters2707 {
    public static boolean containsInArray(String[] dict,String s)
    {
        for(int i=0;i<dict.length;i++)
        {
            if(s.contentEquals(dict[i]))
            {
                return true;
            }

        }
        return false;
    }
    public static int minExtraChar(String s, String[] dictionary) {
        int start1 = 0;
        int start2 = 0;
        int count = 0;
        while(start1<=s.length()-1 )
        {
            System.out.println("start1 : " + start1 + " start2 :" + start2);
            if(start2==s.length()-1 && !containsInArray(dictionary,s.substring(start1,start2)))
            {
                count++;
                start1++;
                start2 = start1 + 1;
            }
            if( containsInArray(dictionary,s.substring(start1,start2 + 1)))
            {
                start1 = start2 + 1;
                start2 = start1 + 1;
            }


            start2++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s= "dwmodizxvvbosxxw";
        String dict[] = {"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"};
        System.out.println(minExtraChar(s,dict));
    }
}
