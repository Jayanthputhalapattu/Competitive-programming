package com.cp.leetcode.greedy;

public class PassThePillow {
    public static int passThePillow(int n, int time) {
        int ans = 0;
            int totalTime = 2*(n-1);
            int remTime =time%totalTime;
            if(remTime==0)
            {
                return 1;
            }
            if(remTime>n-1)
            {
                remTime = remTime -(n-1);
                ans = n - remTime;
            }
            else if(remTime==n-1){
                ans = n;

            }
            else{
                ans =  remTime + 1;
            }
            return ans;
      }
    public static void main(String[] args) {
        int n = 4;
        int time = 5;
       int ans =  passThePillow(n,time);
        System.out.println(ans);
    }
}
