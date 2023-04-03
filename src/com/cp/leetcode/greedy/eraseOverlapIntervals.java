package com.cp.leetcode.greedy;

import java.util.Arrays;

public class eraseOverlapIntervals {
    public static int[][] swap(int[][] intervals,int i,int j)
    {
        int temp1 = intervals[i][0];
        int temp2 = intervals[i][1];

        intervals[i][0] = intervals[j][0];
        intervals[i][1] = intervals[j][1];

        intervals[j][0] = temp1 ;
        intervals[j][1] = temp2;

        return intervals;

    }
    public static int eraseOverlapIntervals(int[][] intervals)
    {
            for(int i=0;i<intervals.length-1;i++)
            {
                for(int j=i + 1;j>0;j--)
                {
                    if(intervals[j-1][0] >intervals[j][0])
                    {
                        //swap
                        swap(intervals,j,j-1);

                    }
                    else{
                        break;
                    }
                }
            }
            //sorting is completed
            for(int i=0;i<intervals.length-1;i++)
            {
                //e1>s2
                    if(intervals[i][1] > intervals[i + 1][0]  || intervals[i][1]>intervals[i+1][1])
                    {
                        //remove most end valued thing
                        if(intervals[i][1]>intervals[i+1][1])
                        {
                        //if first is most valued thing

                        }
                        else{
                            //second is most valued thing

                        }
                    }
            }
            return -1;
    }
    public static void main(String[] args) {
            int intervals[][] = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
