//package com.cp.dynamicprogramming;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LeastSquareInt {
//    public static int numSquares(int n) {
//        //find the perfect squares before 'n'
//        //using dp table to find whether it sums up or not
//        List<Integer> ps = new ArrayList<>();
//        for(int i=1;i<=n;i++)
//        {
//            double a = Math.sqrt(i);
//            if(Math.floor(a)==Math.ceil(a))
//            {
//                ps.add(i);
//            }
//
//        }
//        System.out.println(ps);
//
//        return 1;
//    }
//    public int leastCount(int nums[],int count,int n,int sum,int index)
//    {
//        if(sum==n)
//        {
//            return count;
//        }
//
//
//
//
//
//        //you can go or stay in the same index;
//        //use dp for this....recursion
//    }
//    public static void main(String args[])
//    {
//        int n = 20;
//        System.out.println(numSquares(12));
//    }
//}
