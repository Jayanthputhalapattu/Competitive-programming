package com.cp.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class leetcode_2682 {
    public static int[] circularGameLosers(int n, int k) {
        boolean vals[] = new boolean[n];
        int i = 0;
        int mk = 1;
        while(true)
        {
            if(vals[i])
            {
                break;
            }
            vals[i] = true;

            i = (i + mk*k)%n;
            mk = mk + 1;


        }
        List<Integer> ans = new ArrayList<>();
        for(int ind=0;ind<n;ind++)
        {
            if(!vals[ind] )
            {
                ans.add(ind + 1);
            }
        }
        System.out.println(Arrays.toString(vals));
        int[] finans = new int[ans.size()];
        for(int ind = 0;ind<ans.size();ind++)
        {
            finans[ind] = ans.get(ind);
        }
        return finans;
    }
    public static boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        int original[] = new int[derived.length];
        for(int i=0;i<n-1;i++)
        {
            original[i] = derived[i] ^ derived[i+1];

        }
        original[n-1] =derived[n-1] ^ derived[0];
        if((original[0] ^ original[1]) == original[2])
        {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(Arrays.toString(circularGameLosers(n,k)));
    }
}
