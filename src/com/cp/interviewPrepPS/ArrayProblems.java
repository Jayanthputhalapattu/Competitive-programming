package com.cp.interviewPrepPS;

import java.util.ArrayList;
import java.util.List;

public class ArrayProblems {
    //kandane's algorithm
    public static int kandanes(int arr[])
    {
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            max_ending_here+=arr[i];
            if(max_so_far<max_ending_here)
            {
                max_so_far = max_ending_here;
            }
            if(max_ending_here<0)
            {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxUpRow = 0;
        int maxDown = m-1;
        int maxRight = n-1;
        int maxLeft = 0;
       List<Integer> ans = new ArrayList<>();
        int index = 0;
        //traversing right;
        while(maxUpRow<=maxDown && maxLeft <=maxRight)
        {
            for(int i=maxLeft;i<=maxRight;i++)
            {
               ans.add(matrix[maxUpRow][i]);
                System.out.println("a");
            }
            maxUpRow++;
            for(int i=maxUpRow;i<=maxDown;i++)
            {
                ans.add(matrix[i][maxRight]);
                System.out.println("b");
            }
            maxRight--;
            //go left
            if(maxLeft<=maxRight )
            {
                for(int i=maxRight;i>=maxLeft;i--)
                {
                  ans.add( matrix[maxDown][i]);
                    System.out.println("c");
                }

            }
            maxDown--;
            if( maxDown<=maxUpRow)
            {
                for(int i=maxDown;i>=maxUpRow;i--)
                {
                    ans.add( matrix[i][maxLeft]);
                    System.out.println("d");
                }

            }
            maxLeft++;


        }



        return ans;

    }
    public static void main(String[] args) {
            int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(arr));
    }
}
