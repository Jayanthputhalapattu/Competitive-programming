package com.cp.leetcode.greedy;

public class UglyNum {
    public static int nthUglyNumber(int n) {
        int count=2;
        int start = 3;
        int ans = 0;
        while(count!=n)
        {
            if(start==1)
            {
                start+=1;
                count++;
            }
            int num = start;
            while(num%2==0)
            {
                num = num/2;
            }
            //at this ppoint num is odd;
            boolean add = false;
            for(int i=3;i<=Math.sqrt(num);i=i+2)
            {
                if(num%i==0 )
                {
                    if(i!=2 || i!=3 || i!=5)
                    {
                        // dont add
                        add= false;
                    }
                    else{
                        add = true;
                    }
                   num=num/i;
                }
            }
            if(num>2 || add)
            {
                ans = start;
                start++;
                count++;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
            int n = 10;
        System.out.println(nthUglyNumber(n));

    }
}
