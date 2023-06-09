package com.cp.dynamicprogramming;

public class ZeroOneKnapsack {
    public static int knapsack(int w[],int val[],int weight,int index)
    {
        if(weight==0 || index ==0)
        {
            return 0;
        }
        if(w[index]-weight>=0)
        {
            return Math.max(knapsack(w,val,weight - w[index],index-1), knapsack(w,val,weight,index -1));
        }
            return knapsack(w,val,weight,index-1);
    }
    public static void main(String[] args) {
        int w[] = {1,2,3,4};
        int val[] = {3,5,6,1};
        System.out.println(knapsack(w,val,7,w.length-1));

    }
}
