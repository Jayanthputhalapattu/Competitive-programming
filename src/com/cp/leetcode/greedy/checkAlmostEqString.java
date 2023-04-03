package com.cp.leetcode.greedy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class checkAlmostEqString {
    public static boolean checkAlmostEquivalent(String word1, String word2) {
//        Map<Character,Integer> map1 = new HashMap<>();
//        Map<Character,Integer> map2 = new HashMap<>();
//
//        for(int i=0;i<word1.length();i++)
//        {
//            if(map1.containsKey(word1.charAt(i)))
//            {
//                map1.put(word1.charAt(i),map1.get(word1.charAt(i)) + 1);
//            }
//            else
//                map1.put(word1.charAt(i),1);
//
//            if(map2.containsKey(word2.charAt(i)))
//            {
//                map2.put(word2.charAt(i),map2.get(word2.charAt(i)) + 1);
//            }
//            else
//                map2.put(word2.charAt(i),1);
//        }
//        for(Map.Entry<Character,Integer> entry : map1.entrySet())
//        {
//
//            if(map2.get(entry.getKey())==null )
//            {
//                if(map1.get(entry.getKey())>3)
//                        return false;
//            } else if (Math.abs(map1.get(entry.getKey()) - map2.get(entry.getKey()))>3) {
//                return false;
//            }
//        }
//        for(Map.Entry<Character,Integer> entry : map2.entrySet())
//        {
//
//            if(map1.get(entry.getKey())==null )
//            {
//                if(map2.get(entry.getKey())>3)
//                    return false;
//            } else if (Math.abs(map2.get(entry.getKey()) - map1.get(entry.getKey()))>3) {
//                return false;
//            }
//        }
//        return true;
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(char c : word1.toCharArray()) {
            f1[c - 'a']++;
        }
        for(char c : word2.toCharArray()) {
            f2[c - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(Math.abs(f1[i] - f2[i]) > 3)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "zzzyyy";
        String word2 = "iiiiii";
        System.out.println(checkAlmostEquivalent(word1,word2));
        System.out.println('b' - 'a');
    }
}
