package com.cp.leetCodeArchiveProblems;

import java.util.Arrays;

public class MaxCount {

    public static int maxCount(int[] banned, int n, int maxSum) {
        Arrays.sort(banned);
        boolean isbanned[] = new boolean[banned[banned.length-1] + 1];
        for(int i=0;i<banned.length;i++)
        {
            isbanned[banned[i]] = true;
        }
        int maxval = 0;
        for(int i=1;i<=n;i++)
        {
            if(i>banned[banned.length-1] || i<=banned[banned.length-1] &&!isbanned[i])
            {
                int target = maxSum - i;
                int presentSum = target;
                int count = 1;
                System.out.println(count );
                for(int j=i + 1;j<=target&&presentSum>0 && j<=n;j++)
                {

                    if(presentSum-j>=0 && j<=banned[banned.length-1] &&!isbanned[j])
                    {
                        presentSum = presentSum - j;
                        count++;
                    }
                    else if(presentSum-j>=0 && j>banned[banned.length-1])
                    {
                        presentSum = presentSum - j;
                        count++;
                    }
                }
            maxval = Math.max(maxval,count);

            }
        }
        return maxval;
    }

    public static void main(String[] args) {
//      int nums[] = {179,266,77,196,59,313,286,41,21,201,57,237,74,333,101,281,227,25,138,10,304,55,50,72,244,113,159,330,154,156,311,170,283,9,224,46,197,2,325,237,54,168,275,166,236,30,250,48,274,331,240,153,312,63,303,342,79,37,165,20,79,293,103,152,215,44,56,196,29,251,264,210,212,135,296,123,289,257,208,309,67,114,170,119,337,163,242,162,109,318,51,105,272,240,107,226,224,188,224,317,27,102,63,128,3,133,27,134,186,220,198,24,274,287,267,8,13,322,278,166,304,165,342,89,184,300,312,339,163,307,123,137,293,227,229,57,66,13,71,233,260,79,228,301,4,4,89,196,193,337,205,51,144,99,104,73,10,311,240,168,77,244,114,217,186,134,229,241,46,89,54,127} ;
    int n = 10000;
        int maxSum = 1000000000;
        int nums[] = {1};
        System.out.println(maxCount(nums,n,maxSum));
    }
}
