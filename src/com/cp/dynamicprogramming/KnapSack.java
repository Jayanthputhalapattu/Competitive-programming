package com.cp.dynamicprogramming;

import java.util.Arrays;

public class KnapSack {
    static int ks[][] = new int[5][5];


    static int knapSack(int[] price ,int[] weight,int bag)
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                ks[i][j] =-1;
            }
        }
        return helper(price,weight,bag,price.length);
    }
    static int helper(int[] price ,int[] weight,int bag,int index) {
        if (index == 0 || bag == 0) {
            return 0;
        }
        if (ks[index - 1][bag] != -1) {
            return Math.max(price[index - 1] + helper(price, weight, bag - weight[index - 1], index - 1),
                    helper(price, weight, bag, index - 1));
        } else {
            if(bag - weight[index-1]>=0)
            {
                return ks[index-1][bag] = Math.max(price[index - 1] + helper(price, weight, bag - weight[index - 1], index - 1),
                        helper(price, weight, bag, index - 1));
            }
            else{
                return ks[index-1][bag] =  helper(price,weight,bag,index-1);
            }
        }

    }
    public static void main(String[] args) {
        int price[] = {1,2,3,20};
        int weight[] = {3,2,5,1};

        System.out.println(knapSack(price,weight,4));
//        System.out.println(Arrays.toString(ks[1]));
        for(int i[]:ks)
        {
            for(int j :i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
