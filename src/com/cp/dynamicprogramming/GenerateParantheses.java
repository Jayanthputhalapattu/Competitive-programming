package com.cp.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParantheses {
    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> inner = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                inner.add(1);
            }

            for(int j=0;j<i-1 && i>=2;j++)
            {
                inner.set(j+1,ans.get(i-1).get(j) + ans.get(i-1).get(j+1));
            }
            ans.add(inner);
        }
        return ans;
    }
    public static void main(String[] args) {
       int n = 5;
        System.out.println(generate(n));
    }
}
