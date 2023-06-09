//package com.cp.prevPP;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class wBackTracking {
//
//    public static int backTracking(int[][] nums,int r,int c,boolean num[][],int sum,String path)
//    {
//
//        if(r==nums.length-1 && c==nums[0].length-1)
//        {
////            System.out.println(sum);
//            sum= sum + nums[r][c];
////            for(boolean b[]:num)
////            {
////                System.out.println(Arrays.toString(b));
////            }
////            System.out.println();
//            System.out.println(path + " "  + sum);
//            return sum;
//
//
//        }
//        if(num[r][c])
//        {
//            return 0;
//        }
//        num[r][c] = true;
//
//        int up =0;
//        int down = 0;
//        int right = 0;
//        int ans = 0;
//        if(r>0)
//        {
//
//          up =   backTracking(nums,r -1,c,num,sum + nums[r][c],path+"U");
//        }
//        if(r<nums.length-1)
//        {
//           down =  backTracking(nums,r + 1,c,num,sum + nums[r][c],path+"D");
//        }
//        if(c<nums[0].length-1)
//        {
//           right=  backTracking(nums,r,c + 1,num,sum + nums[r][c],path+"R");
//        }
//
//        ans= Math.max(Math.max(down,up),right);
//        num[r][c] = false;
//
//    return ans;
//    }
//    public static void main(String[] args) {
//        boolean num[][] = new boolean[3][4];
//        int nums[][] = {{2,2,2,2},{2,2,2,2},{2,2,2,2}};
//        System.out.println(backTracking(nums,0,0,num,0,""));
//
//    }
//}
